package com.dong;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @author liudong 2024/5/15
 */
public class DataSource {

    private static final List<Relation> relationList = new ArrayList<>();

    static {
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
    }

    public static List<Relation> getByIdAndType(Set<String> ids) {
        List<Relation> relations = new ArrayList<>();
        for (Relation relation : relationList) {
            if (ids.contains(relation.getSourceId())) {
                relations.add(relation);
            }
        }
        return relations;
    }

}
