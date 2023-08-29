package dev.ArinPrajapati.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collation = "movies")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class moive {
    @Id
    private Object id;
    private String imdbID;
    private String title;
    private String releasedDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;
    @DocumentReference
    private List<Reviews> reviewIds;

}
