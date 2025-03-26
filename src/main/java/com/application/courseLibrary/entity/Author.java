package com.application.courseLibrary.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter  //it generates getters for all the fields generated in class
@Setter
@NoArgsConstructor
@Entity
@Table(name="authors")
public class Author {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//Pk
	private long id;

	@Column(name="name",length=100,nullable = false,unique = true)
	private String name;
	@Column(name="description",length=250,nullable = false)
	private String description;

    @ManyToMany(mappedBy = "authors",cascade = CascadeType.ALL)
	private Set<Book> books=new HashSet<Book>();

	public Author(String name, String description) {
		this.name = name;
		this.description = description;
	}
}
