package com.acep.faq.website.modal.Vo;

import java.io.Serializable;

public class Contents implements Serializable {
    private Integer cid;

    private String faqQuestion;

    private Integer parentCategory;

    private Integer childCategory;

    private String faqContent;

    private static final long serialVersionUID = 1L;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getFaqQuestion() {
        return faqQuestion;
    }

    public void setFaqQuestion(String faqQuestion) {
        this.faqQuestion = faqQuestion == null ? null : faqQuestion.trim();
    }

    public Integer getParentCategory() {
        return parentCategory;
    }

    public void setParentCategory(Integer parentCategory) {
        this.parentCategory = parentCategory;
    }

    public Integer getChildCategory() {
        return childCategory;
    }

    public void setChildCategory(Integer childCategory) {
        this.childCategory = childCategory;
    }

    public String getFaqContent() {
        return faqContent;
    }

    public void setFaqContent(String faqContent) {
        this.faqContent = faqContent == null ? null : faqContent.trim();
    }
}