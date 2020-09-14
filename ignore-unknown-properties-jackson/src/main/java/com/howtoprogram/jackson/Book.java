package com.howtoprogram.jackson;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class Book {

  private Long id;
  private String name;
  private String author;
  // getters and setters

//  @JsonAnySetter
//  public void handleUnknown(String key, Object value) {
//    System.out.print("property not bound:" + key);
//  }

  public Book() {

  }



  public Book(Long id, String name, String author) {
    super();
    this.id = id;
    this.name = name;
    this.author = author;
  }

  /**
   * @return the id
   */
  public Long getId() {
    return id;
  }

  /**
   * @param id the id to set
   */
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * @return the author
   */
  public String getAuthor() {
    return author;
  }

  /**
   * @param author the author to set
   */
  public void setAuthor(String author) {
    this.author = author;
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "Book [id=" + id + ", name=" + name + ", author=" + author + "]";
  }

}
