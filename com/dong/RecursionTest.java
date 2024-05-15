package com.dong;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author liudong 2024/5/15
 */
public class RecursionTest {

    public static void main(String[] args) {
        List<Relation> relationList = new ArrayList<>();
        relationList.add(new Relation("A", "a1", "B", "b2"));
        relationList.add(new Relation("A", "a2", "B", "b1"));
        relationList.add(new Relation("A", "a3", "B", "b2"));
        relationList.add(new Relation("B", "b1", "B", "b2"));
        relationList.add(new Relation("B", "b2", "B", "b1"));
        relationList.add(new Relation("B", "b3", "C", "c2"));
        relationList.add(new Relation("B", "b1", "C", "c1"));
        relationList.add(new Relation("B", "b2", "C", "c1"));
        relationList.add(new Relation("B", "b3", "C", "c2"));
        relationList.add(new Relation("C", "c1", "C", "c2"));
        relationList.add(new Relation("C", "c2", "C", "c3"));
        relationList.add(new Relation("C", "c3", "C", "c4"));
        relationList.add(new Relation("C", "c4", "D", "d1"));
        relationList.add(new Relation("C", "c5", "D", "d1"));

        Set<String> sourceIdList = new HashSet<>();
        sourceIdList.add("a1");
        sourceIdList.add("a2");
        Map<String, Set<String>> resultMap = new HashMap<>();

        resultMap = recursion(sourceIdList, relationList, new HashSet<>(), resultMap);
        for (Map.Entry<String, Set<String>> entry : resultMap.entrySet()) {
            System.out.println("类型 " + entry.getKey() + ": " + String.join(", ", entry.getValue()));
        }
    }

    /**
     * @param sourceIds    源id集合
     * @param relationList 数据表数据
     * @param processedIds 已经处理过的id集合
     * @param resultMap    返回结果
     * @return
     */
    private static Map<String, Set<String>> recursion(Set<String> sourceIds, List<Relation> relationList, Set<String> processedIds, Map<String, Set<String>> resultMap) {
        Set<String> ids = new HashSet<>();
        for (Relation relation : relationList) {
            // 筛选出源id一样的数据，并且没有被处理过
            if (sourceIds.contains(relation.getSourceId()) && !processedIds.contains(relation.getRelationId())) {
                Set<String> visited = resultMap.computeIfAbsent(relation.getRelationType(), k -> new HashSet<>());
                visited.add(relation.getRelationId());
                ids.add(relation.getRelationId());
                processedIds.add(relation.getRelationId());
            }
        }

        Set<String> difference = new HashSet<>(ids);
        ids.removeAll(sourceIds);
        if (difference.size() > 0) {
            return recursion(difference, relationList, processedIds, resultMap);
        } else {
            return resultMap;
        }
    }
}
