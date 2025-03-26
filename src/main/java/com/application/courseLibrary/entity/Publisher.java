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
@Table(name="publishers")
public class Publisher {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="name",length=50,nullable = false,unique = true)
	private String name;

	@ManyToMany(mappedBy = "publishers",cascade = CascadeType.ALL)
	private Set<Book> books=new HashSet<Book>();

	public Publisher(String name) {
		this.name = name;
	}
}
