package com.ignaciosuay.domain;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.RelationshipEntity;

/**
 * Created by natxo on 17/12/16.
 */
@RelationshipEntity(type = "RATED")
public class Rating {

    @GraphId
    Long id;

    String comment;

    int stars;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }
}
