package com.example.SQLRocks;

import javax.persistence.*;

@Entity
@Table(name="Library_info")
public class LibraryCard {
    @Id
    private int cardNo;
    private int fine;
    private int bookIssued;
    @Enumerated(value=EnumType.STRING) // to store (cardStatus)values in db in string format. beacause sql don't have CardStatus datatype.
    private CardStatus cardStatus;

    //child class will have foreign key of the parent class through which
    //it connects to the other table.
    @OneToOne //mapping the relation between two entity
    @JoinColumn // you are telling : add a foreign key column ----> define the column name of the parent class. by default its the primary key.
    User user; // i want to connect with this entity

}
