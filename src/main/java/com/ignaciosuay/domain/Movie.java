package com.ignaciosuay.domain;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;
import java.util.Set;

/**
 * Created by natxo on 17/12/16.
 */
@NodeEntity
public class Movie {

    @GraphId
    Long id;

    String title;

    @Relationship(type="DIRECTED", direction = Relationship.INCOMING)
    Person director;

    @Relationship(type="ACTS_IN", direction = Relationship.INCOMING)
    Set<Person> actors;

    @Relationship(type = "RATED")
    List<Rating> ratings;



}
