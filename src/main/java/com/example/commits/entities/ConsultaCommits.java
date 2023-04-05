package com.example.commits.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "consulta_commits")
public class ConsultaCommits {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "owner")
    private String owner;
    @Column(name = "repository_name")
    private String repositoryName;
    @Column(name = "initial_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date initialDate;
    @Column(name = "final_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date finalDate;
    @Column(name = "days_with_commits_percentage")
    private float daysWithCommitsPercentage;
    @Column(name = "repository_link")
    private String repositoryLink;
    @Column(name = "summary")
    private String summary;
}
