package com.dong;

import java.util.*;

/**
 * @author liudong 2024/5/15
 */
public class RecursionTest1 {

    public static void main(String[] args) {

        Set<String> sourceIdList = new HashSet<>();
        sourceIdList.add("a1");
        sourceIdList.add("a2");
        Map<String, Set<String>> resultMap = new HashMap<>();
        resultMap = recursion(sourceIdList, new HashSet<>(), resultMap);
        for (Map.Entry<String, Set<String>> entry : resultMap.entrySet()) {
            System.out.println("类型 " + entry.getKey() + ": " + String.join(", ", entry.getValue()));
        }
    }

    /**
     * @param sourceIds    源id集合
     * @param processedIds 已经处理过的id集合
     * @param resultMap    返回结果
     * @return
     */
    private static Map<String, Set<String>> recursion(Set<String> sourceIds, Set<String> processedIds, Map<String, Set<String>> resultMap) {
        // 数据表数据
        List<Relation> relationList = DataSource.getByIdAndType(sourceIds);
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
            return recursion(difference, processedIds, resultMap);
        } else {
            return resultMap;
        }
    }
}
