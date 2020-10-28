package com.udemy.callbacks;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PostPersist;
import javax.persistence.PrePersist;

@Entity
@EntityListeners(ArticleListener.class)
public class Article {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int articleId;

	@Column(name = "article_name")
	private String articleName;

	private Date date;
	
	public Article() {

	}

	public Article(String articleName) {
		this.articleName = articleName;
	}

	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getArticleId() {
		return articleId;
	}

	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}

	public String getArticleName() {
		return articleName;
	}

	public void setArticleName(String articleName) {
		this.articleName = articleName;
	}

	@PrePersist
	public void beforePersist() {
		System.out.println("Before persisting article...");
	}

	@PostPersist
	public void afterPersist() {
		System.out.println("After persisting article...");
	}
}
