package com.acep.faq.website.modal.Vo;

import java.util.ArrayList;
import java.util.List;

public class ChildCategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChildCategoryExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andChildCategoryIdIsNull() {
            addCriterion("child_category_id is null");
            return (Criteria) this;
        }

        public Criteria andChildCategoryIdIsNotNull() {
            addCriterion("child_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andChildCategoryIdEqualTo(Integer value) {
            addCriterion("child_category_id =", value, "childCategoryId");
            return (Criteria) this;
        }

        public Criteria andChildCategoryIdNotEqualTo(Integer value) {
            addCriterion("child_category_id <>", value, "childCategoryId");
            return (Criteria) this;
        }

        public Criteria andChildCategoryIdGreaterThan(Integer value) {
            addCriterion("child_category_id >", value, "childCategoryId");
            return (Criteria) this;
        }

        public Criteria andChildCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("child_category_id >=", value, "childCategoryId");
            return (Criteria) this;
        }

        public Criteria andChildCategoryIdLessThan(Integer value) {
            addCriterion("child_category_id <", value, "childCategoryId");
            return (Criteria) this;
        }

        public Criteria andChildCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("child_category_id <=", value, "childCategoryId");
            return (Criteria) this;
        }

        public Criteria andChildCategoryIdIn(List<Integer> values) {
            addCriterion("child_category_id in", values, "childCategoryId");
            return (Criteria) this;
        }

        public Criteria andChildCategoryIdNotIn(List<Integer> values) {
            addCriterion("child_category_id not in", values, "childCategoryId");
            return (Criteria) this;
        }

        public Criteria andChildCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("child_category_id between", value1, value2, "childCategoryId");
            return (Criteria) this;
        }

        public Criteria andChildCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("child_category_id not between", value1, value2, "childCategoryId");
            return (Criteria) this;
        }

        public Criteria andChildCategoryNameIsNull() {
            addCriterion("child_category_name is null");
            return (Criteria) this;
        }

        public Criteria andChildCategoryNameIsNotNull() {
            addCriterion("child_category_name is not null");
            return (Criteria) this;
        }

        public Criteria andChildCategoryNameEqualTo(String value) {
            addCriterion("child_category_name =", value, "childCategoryName");
            return (Criteria) this;
        }

        public Criteria andChildCategoryNameNotEqualTo(String value) {
            addCriterion("child_category_name <>", value, "childCategoryName");
            return (Criteria) this;
        }

        public Criteria andChildCategoryNameGreaterThan(String value) {
            addCriterion("child_category_name >", value, "childCategoryName");
            return (Criteria) this;
        }

        public Criteria andChildCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("child_category_name >=", value, "childCategoryName");
            return (Criteria) this;
        }

        public Criteria andChildCategoryNameLessThan(String value) {
            addCriterion("child_category_name <", value, "childCategoryName");
            return (Criteria) this;
        }

        public Criteria andChildCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("child_category_name <=", value, "childCategoryName");
            return (Criteria) this;
        }

        public Criteria andChildCategoryNameLike(String value) {
            addCriterion("child_category_name like", value, "childCategoryName");
            return (Criteria) this;
        }

        public Criteria andChildCategoryNameNotLike(String value) {
            addCriterion("child_category_name not like", value, "childCategoryName");
            return (Criteria) this;
        }

        public Criteria andChildCategoryNameIn(List<String> values) {
            addCriterion("child_category_name in", values, "childCategoryName");
            return (Criteria) this;
        }

        public Criteria andChildCategoryNameNotIn(List<String> values) {
            addCriterion("child_category_name not in", values, "childCategoryName");
            return (Criteria) this;
        }

        public Criteria andChildCategoryNameBetween(String value1, String value2) {
            addCriterion("child_category_name between", value1, value2, "childCategoryName");
            return (Criteria) this;
        }

        public Criteria andChildCategoryNameNotBetween(String value1, String value2) {
            addCriterion("child_category_name not between", value1, value2, "childCategoryName");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdIsNull() {
            addCriterion("parent_category_id is null");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdIsNotNull() {
            addCriterion("parent_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdEqualTo(Integer value) {
            addCriterion("parent_category_id =", value, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdNotEqualTo(Integer value) {
            addCriterion("parent_category_id <>", value, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdGreaterThan(Integer value) {
            addCriterion("parent_category_id >", value, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_category_id >=", value, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdLessThan(Integer value) {
            addCriterion("parent_category_id <", value, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("parent_category_id <=", value, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdIn(List<Integer> values) {
            addCriterion("parent_category_id in", values, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdNotIn(List<Integer> values) {
            addCriterion("parent_category_id not in", values, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("parent_category_id between", value1, value2, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_category_id not between", value1, value2, "parentCategoryId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}