package wx.repository.wsat.dao.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PocDaoExample {
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database table poc
   *
   * @mbg.generated
   */
  protected String orderByClause;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database table poc
   *
   * @mbg.generated
   */
  protected boolean distinct;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database table poc
   *
   * @mbg.generated
   */
  protected List<Criteria> oredCriteria;

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * poc
   *
   * @mbg.generated
   */
  public PocDaoExample() {
    oredCriteria = new ArrayList<Criteria>();
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * poc
   *
   * @mbg.generated
   */
  public void setOrderByClause(String orderByClause) {
    this.orderByClause = orderByClause;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * poc
   *
   * @mbg.generated
   */
  public String getOrderByClause() {
    return orderByClause;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * poc
   *
   * @mbg.generated
   */
  public void setDistinct(boolean distinct) {
    this.distinct = distinct;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * poc
   *
   * @mbg.generated
   */
  public boolean isDistinct() {
    return distinct;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * poc
   *
   * @mbg.generated
   */
  public List<Criteria> getOredCriteria() {
    return oredCriteria;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * poc
   *
   * @mbg.generated
   */
  public void or(Criteria criteria) {
    oredCriteria.add(criteria);
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * poc
   *
   * @mbg.generated
   */
  public Criteria or() {
    Criteria criteria = createCriteriaInternal();
    oredCriteria.add(criteria);
    return criteria;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * poc
   *
   * @mbg.generated
   */
  public Criteria createCriteria() {
    Criteria criteria = createCriteriaInternal();
    if (oredCriteria.size() == 0) {
      oredCriteria.add(criteria);
    }
    return criteria;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * poc
   *
   * @mbg.generated
   */
  protected Criteria createCriteriaInternal() {
    Criteria criteria = new Criteria();
    return criteria;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * poc
   *
   * @mbg.generated
   */
  public void clear() {
    oredCriteria.clear();
    orderByClause = null;
    distinct = false;
  }

  /**
   * This class was generated by MyBatis Generator. This class corresponds to the database table poc
   *
   * @mbg.generated
   */
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

    protected void addCriterionForJDBCDate(String condition, Date value, String property) {
      if (value == null) {
        throw new RuntimeException("Value for " + property + " cannot be null");
      }
      addCriterion(condition, new java.sql.Date(value.getTime()), property);
    }

    protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
      if (values == null || values.size() == 0) {
        throw new RuntimeException("Value list for " + property + " cannot be null or empty");
      }
      List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
      Iterator<Date> iter = values.iterator();
      while (iter.hasNext()) {
        dateList.add(new java.sql.Date(iter.next().getTime()));
      }
      addCriterion(condition, dateList, property);
    }

    protected void addCriterionForJDBCDate(
        String condition, Date value1, Date value2, String property) {
      if (value1 == null || value2 == null) {
        throw new RuntimeException("Between values for " + property + " cannot be null");
      }
      addCriterion(
          condition,
          new java.sql.Date(value1.getTime()),
          new java.sql.Date(value2.getTime()),
          property);
    }

    public Criteria andIdIsNull() {
      addCriterion("_id is null");
      return (Criteria) this;
    }

    public Criteria andIdIsNotNull() {
      addCriterion("_id is not null");
      return (Criteria) this;
    }

    public Criteria andIdEqualTo(Integer value) {
      addCriterion("_id =", value, "id");
      return (Criteria) this;
    }

    public Criteria andIdNotEqualTo(Integer value) {
      addCriterion("_id <>", value, "id");
      return (Criteria) this;
    }

    public Criteria andIdGreaterThan(Integer value) {
      addCriterion("_id >", value, "id");
      return (Criteria) this;
    }

    public Criteria andIdGreaterThanOrEqualTo(Integer value) {
      addCriterion("_id >=", value, "id");
      return (Criteria) this;
    }

    public Criteria andIdLessThan(Integer value) {
      addCriterion("_id <", value, "id");
      return (Criteria) this;
    }

    public Criteria andIdLessThanOrEqualTo(Integer value) {
      addCriterion("_id <=", value, "id");
      return (Criteria) this;
    }

    public Criteria andIdIn(List<Integer> values) {
      addCriterion("_id in", values, "id");
      return (Criteria) this;
    }

    public Criteria andIdNotIn(List<Integer> values) {
      addCriterion("_id not in", values, "id");
      return (Criteria) this;
    }

    public Criteria andIdBetween(Integer value1, Integer value2) {
      addCriterion("_id between", value1, value2, "id");
      return (Criteria) this;
    }

    public Criteria andIdNotBetween(Integer value1, Integer value2) {
      addCriterion("_id not between", value1, value2, "id");
      return (Criteria) this;
    }

    public Criteria andPocIdIsNull() {
      addCriterion("poc_id is null");
      return (Criteria) this;
    }

    public Criteria andPocIdIsNotNull() {
      addCriterion("poc_id is not null");
      return (Criteria) this;
    }

    public Criteria andPocIdEqualTo(String value) {
      addCriterion("poc_id =", value, "pocId");
      return (Criteria) this;
    }

    public Criteria andPocIdNotEqualTo(String value) {
      addCriterion("poc_id <>", value, "pocId");
      return (Criteria) this;
    }

    public Criteria andPocIdGreaterThan(String value) {
      addCriterion("poc_id >", value, "pocId");
      return (Criteria) this;
    }

    public Criteria andPocIdGreaterThanOrEqualTo(String value) {
      addCriterion("poc_id >=", value, "pocId");
      return (Criteria) this;
    }

    public Criteria andPocIdLessThan(String value) {
      addCriterion("poc_id <", value, "pocId");
      return (Criteria) this;
    }

    public Criteria andPocIdLessThanOrEqualTo(String value) {
      addCriterion("poc_id <=", value, "pocId");
      return (Criteria) this;
    }

    public Criteria andPocIdLike(String value) {
      addCriterion("poc_id like", value, "pocId");
      return (Criteria) this;
    }

    public Criteria andPocIdNotLike(String value) {
      addCriterion("poc_id not like", value, "pocId");
      return (Criteria) this;
    }

    public Criteria andPocIdIn(List<String> values) {
      addCriterion("poc_id in", values, "pocId");
      return (Criteria) this;
    }

    public Criteria andPocIdNotIn(List<String> values) {
      addCriterion("poc_id not in", values, "pocId");
      return (Criteria) this;
    }

    public Criteria andPocIdBetween(String value1, String value2) {
      addCriterion("poc_id between", value1, value2, "pocId");
      return (Criteria) this;
    }

    public Criteria andPocIdNotBetween(String value1, String value2) {
      addCriterion("poc_id not between", value1, value2, "pocId");
      return (Criteria) this;
    }

    public Criteria andVulnIdIsNull() {
      addCriterion("vuln_id is null");
      return (Criteria) this;
    }

    public Criteria andVulnIdIsNotNull() {
      addCriterion("vuln_id is not null");
      return (Criteria) this;
    }

    public Criteria andVulnIdEqualTo(String value) {
      addCriterion("vuln_id =", value, "vulnId");
      return (Criteria) this;
    }

    public Criteria andVulnIdNotEqualTo(String value) {
      addCriterion("vuln_id <>", value, "vulnId");
      return (Criteria) this;
    }

    public Criteria andVulnIdGreaterThan(String value) {
      addCriterion("vuln_id >", value, "vulnId");
      return (Criteria) this;
    }

    public Criteria andVulnIdGreaterThanOrEqualTo(String value) {
      addCriterion("vuln_id >=", value, "vulnId");
      return (Criteria) this;
    }

    public Criteria andVulnIdLessThan(String value) {
      addCriterion("vuln_id <", value, "vulnId");
      return (Criteria) this;
    }

    public Criteria andVulnIdLessThanOrEqualTo(String value) {
      addCriterion("vuln_id <=", value, "vulnId");
      return (Criteria) this;
    }

    public Criteria andVulnIdLike(String value) {
      addCriterion("vuln_id like", value, "vulnId");
      return (Criteria) this;
    }

    public Criteria andVulnIdNotLike(String value) {
      addCriterion("vuln_id not like", value, "vulnId");
      return (Criteria) this;
    }

    public Criteria andVulnIdIn(List<String> values) {
      addCriterion("vuln_id in", values, "vulnId");
      return (Criteria) this;
    }

    public Criteria andVulnIdNotIn(List<String> values) {
      addCriterion("vuln_id not in", values, "vulnId");
      return (Criteria) this;
    }

    public Criteria andVulnIdBetween(String value1, String value2) {
      addCriterion("vuln_id between", value1, value2, "vulnId");
      return (Criteria) this;
    }

    public Criteria andVulnIdNotBetween(String value1, String value2) {
      addCriterion("vuln_id not between", value1, value2, "vulnId");
      return (Criteria) this;
    }

    public Criteria andPocNameIsNull() {
      addCriterion("poc_name is null");
      return (Criteria) this;
    }

    public Criteria andPocNameIsNotNull() {
      addCriterion("poc_name is not null");
      return (Criteria) this;
    }

    public Criteria andPocNameEqualTo(String value) {
      addCriterion("poc_name =", value, "pocName");
      return (Criteria) this;
    }

    public Criteria andPocNameNotEqualTo(String value) {
      addCriterion("poc_name <>", value, "pocName");
      return (Criteria) this;
    }

    public Criteria andPocNameGreaterThan(String value) {
      addCriterion("poc_name >", value, "pocName");
      return (Criteria) this;
    }

    public Criteria andPocNameGreaterThanOrEqualTo(String value) {
      addCriterion("poc_name >=", value, "pocName");
      return (Criteria) this;
    }

    public Criteria andPocNameLessThan(String value) {
      addCriterion("poc_name <", value, "pocName");
      return (Criteria) this;
    }

    public Criteria andPocNameLessThanOrEqualTo(String value) {
      addCriterion("poc_name <=", value, "pocName");
      return (Criteria) this;
    }

    public Criteria andPocNameLike(String value) {
      addCriterion("poc_name like", value, "pocName");
      return (Criteria) this;
    }

    public Criteria andPocNameNotLike(String value) {
      addCriterion("poc_name not like", value, "pocName");
      return (Criteria) this;
    }

    public Criteria andPocNameIn(List<String> values) {
      addCriterion("poc_name in", values, "pocName");
      return (Criteria) this;
    }

    public Criteria andPocNameNotIn(List<String> values) {
      addCriterion("poc_name not in", values, "pocName");
      return (Criteria) this;
    }

    public Criteria andPocNameBetween(String value1, String value2) {
      addCriterion("poc_name between", value1, value2, "pocName");
      return (Criteria) this;
    }

    public Criteria andPocNameNotBetween(String value1, String value2) {
      addCriterion("poc_name not between", value1, value2, "pocName");
      return (Criteria) this;
    }

    public Criteria andAuthorIsNull() {
      addCriterion("author is null");
      return (Criteria) this;
    }

    public Criteria andAuthorIsNotNull() {
      addCriterion("author is not null");
      return (Criteria) this;
    }

    public Criteria andAuthorEqualTo(String value) {
      addCriterion("author =", value, "author");
      return (Criteria) this;
    }

    public Criteria andAuthorNotEqualTo(String value) {
      addCriterion("author <>", value, "author");
      return (Criteria) this;
    }

    public Criteria andAuthorGreaterThan(String value) {
      addCriterion("author >", value, "author");
      return (Criteria) this;
    }

    public Criteria andAuthorGreaterThanOrEqualTo(String value) {
      addCriterion("author >=", value, "author");
      return (Criteria) this;
    }

    public Criteria andAuthorLessThan(String value) {
      addCriterion("author <", value, "author");
      return (Criteria) this;
    }

    public Criteria andAuthorLessThanOrEqualTo(String value) {
      addCriterion("author <=", value, "author");
      return (Criteria) this;
    }

    public Criteria andAuthorLike(String value) {
      addCriterion("author like", value, "author");
      return (Criteria) this;
    }

    public Criteria andAuthorNotLike(String value) {
      addCriterion("author not like", value, "author");
      return (Criteria) this;
    }

    public Criteria andAuthorIn(List<String> values) {
      addCriterion("author in", values, "author");
      return (Criteria) this;
    }

    public Criteria andAuthorNotIn(List<String> values) {
      addCriterion("author not in", values, "author");
      return (Criteria) this;
    }

    public Criteria andAuthorBetween(String value1, String value2) {
      addCriterion("author between", value1, value2, "author");
      return (Criteria) this;
    }

    public Criteria andAuthorNotBetween(String value1, String value2) {
      addCriterion("author not between", value1, value2, "author");
      return (Criteria) this;
    }

    public Criteria andCreateTimeIsNull() {
      addCriterion("create_time is null");
      return (Criteria) this;
    }

    public Criteria andCreateTimeIsNotNull() {
      addCriterion("create_time is not null");
      return (Criteria) this;
    }

    public Criteria andCreateTimeEqualTo(Date value) {
      addCriterionForJDBCDate("create_time =", value, "createTime");
      return (Criteria) this;
    }

    public Criteria andCreateTimeNotEqualTo(Date value) {
      addCriterionForJDBCDate("create_time <>", value, "createTime");
      return (Criteria) this;
    }

    public Criteria andCreateTimeGreaterThan(Date value) {
      addCriterionForJDBCDate("create_time >", value, "createTime");
      return (Criteria) this;
    }

    public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
      addCriterionForJDBCDate("create_time >=", value, "createTime");
      return (Criteria) this;
    }

    public Criteria andCreateTimeLessThan(Date value) {
      addCriterionForJDBCDate("create_time <", value, "createTime");
      return (Criteria) this;
    }

    public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
      addCriterionForJDBCDate("create_time <=", value, "createTime");
      return (Criteria) this;
    }

    public Criteria andCreateTimeIn(List<Date> values) {
      addCriterionForJDBCDate("create_time in", values, "createTime");
      return (Criteria) this;
    }

    public Criteria andCreateTimeNotIn(List<Date> values) {
      addCriterionForJDBCDate("create_time not in", values, "createTime");
      return (Criteria) this;
    }

    public Criteria andCreateTimeBetween(Date value1, Date value2) {
      addCriterionForJDBCDate("create_time between", value1, value2, "createTime");
      return (Criteria) this;
    }

    public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
      addCriterionForJDBCDate("create_time not between", value1, value2, "createTime");
      return (Criteria) this;
    }

    public Criteria andImageNameIsNull() {
      addCriterion("image_name is null");
      return (Criteria) this;
    }

    public Criteria andImageNameIsNotNull() {
      addCriterion("image_name is not null");
      return (Criteria) this;
    }

    public Criteria andImageNameEqualTo(String value) {
      addCriterion("image_name =", value, "imageName");
      return (Criteria) this;
    }

    public Criteria andImageNameNotEqualTo(String value) {
      addCriterion("image_name <>", value, "imageName");
      return (Criteria) this;
    }

    public Criteria andImageNameGreaterThan(String value) {
      addCriterion("image_name >", value, "imageName");
      return (Criteria) this;
    }

    public Criteria andImageNameGreaterThanOrEqualTo(String value) {
      addCriterion("image_name >=", value, "imageName");
      return (Criteria) this;
    }

    public Criteria andImageNameLessThan(String value) {
      addCriterion("image_name <", value, "imageName");
      return (Criteria) this;
    }

    public Criteria andImageNameLessThanOrEqualTo(String value) {
      addCriterion("image_name <=", value, "imageName");
      return (Criteria) this;
    }

    public Criteria andImageNameLike(String value) {
      addCriterion("image_name like", value, "imageName");
      return (Criteria) this;
    }

    public Criteria andImageNameNotLike(String value) {
      addCriterion("image_name not like", value, "imageName");
      return (Criteria) this;
    }

    public Criteria andImageNameIn(List<String> values) {
      addCriterion("image_name in", values, "imageName");
      return (Criteria) this;
    }

    public Criteria andImageNameNotIn(List<String> values) {
      addCriterion("image_name not in", values, "imageName");
      return (Criteria) this;
    }

    public Criteria andImageNameBetween(String value1, String value2) {
      addCriterion("image_name between", value1, value2, "imageName");
      return (Criteria) this;
    }

    public Criteria andImageNameNotBetween(String value1, String value2) {
      addCriterion("image_name not between", value1, value2, "imageName");
      return (Criteria) this;
    }

    public Criteria andCreatedAtIsNull() {
      addCriterion("created_at is null");
      return (Criteria) this;
    }

    public Criteria andCreatedAtIsNotNull() {
      addCriterion("created_at is not null");
      return (Criteria) this;
    }

    public Criteria andCreatedAtEqualTo(Date value) {
      addCriterion("created_at =", value, "createdAt");
      return (Criteria) this;
    }

    public Criteria andCreatedAtNotEqualTo(Date value) {
      addCriterion("created_at <>", value, "createdAt");
      return (Criteria) this;
    }

    public Criteria andCreatedAtGreaterThan(Date value) {
      addCriterion("created_at >", value, "createdAt");
      return (Criteria) this;
    }

    public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
      addCriterion("created_at >=", value, "createdAt");
      return (Criteria) this;
    }

    public Criteria andCreatedAtLessThan(Date value) {
      addCriterion("created_at <", value, "createdAt");
      return (Criteria) this;
    }

    public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
      addCriterion("created_at <=", value, "createdAt");
      return (Criteria) this;
    }

    public Criteria andCreatedAtIn(List<Date> values) {
      addCriterion("created_at in", values, "createdAt");
      return (Criteria) this;
    }

    public Criteria andCreatedAtNotIn(List<Date> values) {
      addCriterion("created_at not in", values, "createdAt");
      return (Criteria) this;
    }

    public Criteria andCreatedAtBetween(Date value1, Date value2) {
      addCriterion("created_at between", value1, value2, "createdAt");
      return (Criteria) this;
    }

    public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
      addCriterion("created_at not between", value1, value2, "createdAt");
      return (Criteria) this;
    }

    public Criteria andUpdatedAtIsNull() {
      addCriterion("updated_at is null");
      return (Criteria) this;
    }

    public Criteria andUpdatedAtIsNotNull() {
      addCriterion("updated_at is not null");
      return (Criteria) this;
    }

    public Criteria andUpdatedAtEqualTo(Date value) {
      addCriterion("updated_at =", value, "updatedAt");
      return (Criteria) this;
    }

    public Criteria andUpdatedAtNotEqualTo(Date value) {
      addCriterion("updated_at <>", value, "updatedAt");
      return (Criteria) this;
    }

    public Criteria andUpdatedAtGreaterThan(Date value) {
      addCriterion("updated_at >", value, "updatedAt");
      return (Criteria) this;
    }

    public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
      addCriterion("updated_at >=", value, "updatedAt");
      return (Criteria) this;
    }

    public Criteria andUpdatedAtLessThan(Date value) {
      addCriterion("updated_at <", value, "updatedAt");
      return (Criteria) this;
    }

    public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
      addCriterion("updated_at <=", value, "updatedAt");
      return (Criteria) this;
    }

    public Criteria andUpdatedAtIn(List<Date> values) {
      addCriterion("updated_at in", values, "updatedAt");
      return (Criteria) this;
    }

    public Criteria andUpdatedAtNotIn(List<Date> values) {
      addCriterion("updated_at not in", values, "updatedAt");
      return (Criteria) this;
    }

    public Criteria andUpdatedAtBetween(Date value1, Date value2) {
      addCriterion("updated_at between", value1, value2, "updatedAt");
      return (Criteria) this;
    }

    public Criteria andUpdatedAtNotBetween(Date value1, Date value2) {
      addCriterion("updated_at not between", value1, value2, "updatedAt");
      return (Criteria) this;
    }

    public Criteria andDeletedAtIsNull() {
      addCriterion("deleted_at is null");
      return (Criteria) this;
    }

    public Criteria andDeletedAtIsNotNull() {
      addCriterion("deleted_at is not null");
      return (Criteria) this;
    }

    public Criteria andDeletedAtEqualTo(Date value) {
      addCriterion("deleted_at =", value, "deletedAt");
      return (Criteria) this;
    }

    public Criteria andDeletedAtNotEqualTo(Date value) {
      addCriterion("deleted_at <>", value, "deletedAt");
      return (Criteria) this;
    }

    public Criteria andDeletedAtGreaterThan(Date value) {
      addCriterion("deleted_at >", value, "deletedAt");
      return (Criteria) this;
    }

    public Criteria andDeletedAtGreaterThanOrEqualTo(Date value) {
      addCriterion("deleted_at >=", value, "deletedAt");
      return (Criteria) this;
    }

    public Criteria andDeletedAtLessThan(Date value) {
      addCriterion("deleted_at <", value, "deletedAt");
      return (Criteria) this;
    }

    public Criteria andDeletedAtLessThanOrEqualTo(Date value) {
      addCriterion("deleted_at <=", value, "deletedAt");
      return (Criteria) this;
    }

    public Criteria andDeletedAtIn(List<Date> values) {
      addCriterion("deleted_at in", values, "deletedAt");
      return (Criteria) this;
    }

    public Criteria andDeletedAtNotIn(List<Date> values) {
      addCriterion("deleted_at not in", values, "deletedAt");
      return (Criteria) this;
    }

    public Criteria andDeletedAtBetween(Date value1, Date value2) {
      addCriterion("deleted_at between", value1, value2, "deletedAt");
      return (Criteria) this;
    }

    public Criteria andDeletedAtNotBetween(Date value1, Date value2) {
      addCriterion("deleted_at not between", value1, value2, "deletedAt");
      return (Criteria) this;
    }
  }

  /**
   * This class was generated by MyBatis Generator. This class corresponds to the database table poc
   *
   * @mbg.generated do_not_delete_during_merge
   */
  public static class Criteria extends GeneratedCriteria {

    protected Criteria() {
      super();
    }
  }

  /**
   * This class was generated by MyBatis Generator. This class corresponds to the database table poc
   *
   * @mbg.generated
   */
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
