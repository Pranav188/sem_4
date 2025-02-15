package com.localeventfinder.Local.Event.Finder.Entity;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "Events")
@Data
public class Variables {
    @Id
    ObjectId id;

    String host;

    String venue;

    String time;

    String details;

    LocalDateTime date;

}
