package models;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.User;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-04-06T15:48:59")
@StaticMetamodel(Note.class)
public class Note_ { 

    public static volatile SingularAttribute<Note, User> owner;
    public static volatile SingularAttribute<Note, String> contents;
    public static volatile SingularAttribute<Note, Integer> noteId;
    public static volatile SingularAttribute<Note, String> title;

}