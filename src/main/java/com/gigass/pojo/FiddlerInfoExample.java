package com.gigass.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class FiddlerInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FiddlerInfoExample() {
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

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
        }

        public Criteria andSeriesIsNull() {
            addCriterion("series is null");
            return (Criteria) this;
        }

        public Criteria andSeriesIsNotNull() {
            addCriterion("series is not null");
            return (Criteria) this;
        }

        public Criteria andSeriesEqualTo(Integer value) {
            addCriterion("series =", value, "series");
            return (Criteria) this;
        }

        public Criteria andSeriesNotEqualTo(Integer value) {
            addCriterion("series <>", value, "series");
            return (Criteria) this;
        }

        public Criteria andSeriesGreaterThan(Integer value) {
            addCriterion("series >", value, "series");
            return (Criteria) this;
        }

        public Criteria andSeriesGreaterThanOrEqualTo(Integer value) {
            addCriterion("series >=", value, "series");
            return (Criteria) this;
        }

        public Criteria andSeriesLessThan(Integer value) {
            addCriterion("series <", value, "series");
            return (Criteria) this;
        }

        public Criteria andSeriesLessThanOrEqualTo(Integer value) {
            addCriterion("series <=", value, "series");
            return (Criteria) this;
        }

        public Criteria andSeriesIn(List<Integer> values) {
            addCriterion("series in", values, "series");
            return (Criteria) this;
        }

        public Criteria andSeriesNotIn(List<Integer> values) {
            addCriterion("series not in", values, "series");
            return (Criteria) this;
        }

        public Criteria andSeriesBetween(Integer value1, Integer value2) {
            addCriterion("series between", value1, value2, "series");
            return (Criteria) this;
        }

        public Criteria andSeriesNotBetween(Integer value1, Integer value2) {
            addCriterion("series not between", value1, value2, "series");
            return (Criteria) this;
        }

        public Criteria andIsreadIsNull() {
            addCriterion("isRead is null");
            return (Criteria) this;
        }

        public Criteria andIsreadIsNotNull() {
            addCriterion("isRead is not null");
            return (Criteria) this;
        }

        public Criteria andIsreadEqualTo(String value) {
            addCriterion("isRead =", value, "isread");
            return (Criteria) this;
        }

        public Criteria andIsreadNotEqualTo(String value) {
            addCriterion("isRead <>", value, "isread");
            return (Criteria) this;
        }

        public Criteria andIsreadGreaterThan(String value) {
            addCriterion("isRead >", value, "isread");
            return (Criteria) this;
        }

        public Criteria andIsreadGreaterThanOrEqualTo(String value) {
            addCriterion("isRead >=", value, "isread");
            return (Criteria) this;
        }

        public Criteria andIsreadLessThan(String value) {
            addCriterion("isRead <", value, "isread");
            return (Criteria) this;
        }

        public Criteria andIsreadLessThanOrEqualTo(String value) {
            addCriterion("isRead <=", value, "isread");
            return (Criteria) this;
        }

        public Criteria andIsreadLike(String value) {
            addCriterion("isRead like", value, "isread");
            return (Criteria) this;
        }

        public Criteria andIsreadNotLike(String value) {
            addCriterion("isRead not like", value, "isread");
            return (Criteria) this;
        }

        public Criteria andIsreadIn(List<String> values) {
            addCriterion("isRead in", values, "isread");
            return (Criteria) this;
        }

        public Criteria andIsreadNotIn(List<String> values) {
            addCriterion("isRead not in", values, "isread");
            return (Criteria) this;
        }

        public Criteria andIsreadBetween(String value1, String value2) {
            addCriterion("isRead between", value1, value2, "isread");
            return (Criteria) this;
        }

        public Criteria andIsreadNotBetween(String value1, String value2) {
            addCriterion("isRead not between", value1, value2, "isread");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIsNull() {
            addCriterion("creat_time is null");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIsNotNull() {
            addCriterion("creat_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreatTimeEqualTo(Date value) {
            addCriterionForJDBCTime("creat_time =", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("creat_time <>", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("creat_time >", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("creat_time >=", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeLessThan(Date value) {
            addCriterionForJDBCTime("creat_time <", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("creat_time <=", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIn(List<Date> values) {
            addCriterionForJDBCTime("creat_time in", values, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("creat_time not in", values, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("creat_time between", value1, value2, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("creat_time not between", value1, value2, "creatTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeIsNull() {
            addCriterion("up_time is null");
            return (Criteria) this;
        }

        public Criteria andUpTimeIsNotNull() {
            addCriterion("up_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpTimeEqualTo(Date value) {
            addCriterionForJDBCTime("up_time =", value, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("up_time <>", value, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("up_time >", value, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("up_time >=", value, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeLessThan(Date value) {
            addCriterionForJDBCTime("up_time <", value, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("up_time <=", value, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeIn(List<Date> values) {
            addCriterionForJDBCTime("up_time in", values, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("up_time not in", values, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("up_time between", value1, value2, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("up_time not between", value1, value2, "upTime");
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