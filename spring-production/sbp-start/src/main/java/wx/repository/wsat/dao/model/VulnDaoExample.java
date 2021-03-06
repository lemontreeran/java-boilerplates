package wx.repository.wsat.dao.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class VulnDaoExample {
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database table
   * vuln
   *
   * @mbg.generated
   */
  protected String orderByClause;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database table
   * vuln
   *
   * @mbg.generated
   */
  protected boolean distinct;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database table
   * vuln
   *
   * @mbg.generated
   */
  protected List<Criteria> oredCriteria;

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * vuln
   *
   * @mbg.generated
   */
  public VulnDaoExample() {
    oredCriteria = new ArrayList<Criteria>();
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * vuln
   *
   * @mbg.generated
   */
  public void setOrderByClause(String orderByClause) {
    this.orderByClause = orderByClause;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * vuln
   *
   * @mbg.generated
   */
  public String getOrderByClause() {
    return orderByClause;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * vuln
   *
   * @mbg.generated
   */
  public void setDistinct(boolean distinct) {
    this.distinct = distinct;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * vuln
   *
   * @mbg.generated
   */
  public boolean isDistinct() {
    return distinct;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * vuln
   *
   * @mbg.generated
   */
  public List<Criteria> getOredCriteria() {
    return oredCriteria;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * vuln
   *
   * @mbg.generated
   */
  public void or(Criteria criteria) {
    oredCriteria.add(criteria);
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * vuln
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
   * vuln
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
   * vuln
   *
   * @mbg.generated
   */
  protected Criteria createCriteriaInternal() {
    Criteria criteria = new Criteria();
    return criteria;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * vuln
   *
   * @mbg.generated
   */
  public void clear() {
    oredCriteria.clear();
    orderByClause = null;
    distinct = false;
  }

  /**
   * This class was generated by MyBatis Generator. This class corresponds to the database table
   * vuln
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

    public Criteria andVulnNameIsNull() {
      addCriterion("vuln_name is null");
      return (Criteria) this;
    }

    public Criteria andVulnNameIsNotNull() {
      addCriterion("vuln_name is not null");
      return (Criteria) this;
    }

    public Criteria andVulnNameEqualTo(String value) {
      addCriterion("vuln_name =", value, "vulnName");
      return (Criteria) this;
    }

    public Criteria andVulnNameNotEqualTo(String value) {
      addCriterion("vuln_name <>", value, "vulnName");
      return (Criteria) this;
    }

    public Criteria andVulnNameGreaterThan(String value) {
      addCriterion("vuln_name >", value, "vulnName");
      return (Criteria) this;
    }

    public Criteria andVulnNameGreaterThanOrEqualTo(String value) {
      addCriterion("vuln_name >=", value, "vulnName");
      return (Criteria) this;
    }

    public Criteria andVulnNameLessThan(String value) {
      addCriterion("vuln_name <", value, "vulnName");
      return (Criteria) this;
    }

    public Criteria andVulnNameLessThanOrEqualTo(String value) {
      addCriterion("vuln_name <=", value, "vulnName");
      return (Criteria) this;
    }

    public Criteria andVulnNameLike(String value) {
      addCriterion("vuln_name like", value, "vulnName");
      return (Criteria) this;
    }

    public Criteria andVulnNameNotLike(String value) {
      addCriterion("vuln_name not like", value, "vulnName");
      return (Criteria) this;
    }

    public Criteria andVulnNameIn(List<String> values) {
      addCriterion("vuln_name in", values, "vulnName");
      return (Criteria) this;
    }

    public Criteria andVulnNameNotIn(List<String> values) {
      addCriterion("vuln_name not in", values, "vulnName");
      return (Criteria) this;
    }

    public Criteria andVulnNameBetween(String value1, String value2) {
      addCriterion("vuln_name between", value1, value2, "vulnName");
      return (Criteria) this;
    }

    public Criteria andVulnNameNotBetween(String value1, String value2) {
      addCriterion("vuln_name not between", value1, value2, "vulnName");
      return (Criteria) this;
    }

    public Criteria andVulnTypeIsNull() {
      addCriterion("vuln_type is null");
      return (Criteria) this;
    }

    public Criteria andVulnTypeIsNotNull() {
      addCriterion("vuln_type is not null");
      return (Criteria) this;
    }

    public Criteria andVulnTypeEqualTo(Integer value) {
      addCriterion("vuln_type =", value, "vulnType");
      return (Criteria) this;
    }

    public Criteria andVulnTypeNotEqualTo(Integer value) {
      addCriterion("vuln_type <>", value, "vulnType");
      return (Criteria) this;
    }

    public Criteria andVulnTypeGreaterThan(Integer value) {
      addCriterion("vuln_type >", value, "vulnType");
      return (Criteria) this;
    }

    public Criteria andVulnTypeGreaterThanOrEqualTo(Integer value) {
      addCriterion("vuln_type >=", value, "vulnType");
      return (Criteria) this;
    }

    public Criteria andVulnTypeLessThan(Integer value) {
      addCriterion("vuln_type <", value, "vulnType");
      return (Criteria) this;
    }

    public Criteria andVulnTypeLessThanOrEqualTo(Integer value) {
      addCriterion("vuln_type <=", value, "vulnType");
      return (Criteria) this;
    }

    public Criteria andVulnTypeIn(List<Integer> values) {
      addCriterion("vuln_type in", values, "vulnType");
      return (Criteria) this;
    }

    public Criteria andVulnTypeNotIn(List<Integer> values) {
      addCriterion("vuln_type not in", values, "vulnType");
      return (Criteria) this;
    }

    public Criteria andVulnTypeBetween(Integer value1, Integer value2) {
      addCriterion("vuln_type between", value1, value2, "vulnType");
      return (Criteria) this;
    }

    public Criteria andVulnTypeNotBetween(Integer value1, Integer value2) {
      addCriterion("vuln_type not between", value1, value2, "vulnType");
      return (Criteria) this;
    }

    public Criteria andCIdIsNull() {
      addCriterion("c_id is null");
      return (Criteria) this;
    }

    public Criteria andCIdIsNotNull() {
      addCriterion("c_id is not null");
      return (Criteria) this;
    }

    public Criteria andCIdEqualTo(String value) {
      addCriterion("c_id =", value, "cId");
      return (Criteria) this;
    }

    public Criteria andCIdNotEqualTo(String value) {
      addCriterion("c_id <>", value, "cId");
      return (Criteria) this;
    }

    public Criteria andCIdGreaterThan(String value) {
      addCriterion("c_id >", value, "cId");
      return (Criteria) this;
    }

    public Criteria andCIdGreaterThanOrEqualTo(String value) {
      addCriterion("c_id >=", value, "cId");
      return (Criteria) this;
    }

    public Criteria andCIdLessThan(String value) {
      addCriterion("c_id <", value, "cId");
      return (Criteria) this;
    }

    public Criteria andCIdLessThanOrEqualTo(String value) {
      addCriterion("c_id <=", value, "cId");
      return (Criteria) this;
    }

    public Criteria andCIdLike(String value) {
      addCriterion("c_id like", value, "cId");
      return (Criteria) this;
    }

    public Criteria andCIdNotLike(String value) {
      addCriterion("c_id not like", value, "cId");
      return (Criteria) this;
    }

    public Criteria andCIdIn(List<String> values) {
      addCriterion("c_id in", values, "cId");
      return (Criteria) this;
    }

    public Criteria andCIdNotIn(List<String> values) {
      addCriterion("c_id not in", values, "cId");
      return (Criteria) this;
    }

    public Criteria andCIdBetween(String value1, String value2) {
      addCriterion("c_id between", value1, value2, "cId");
      return (Criteria) this;
    }

    public Criteria andCIdNotBetween(String value1, String value2) {
      addCriterion("c_id not between", value1, value2, "cId");
      return (Criteria) this;
    }

    public Criteria andCVersionIsNull() {
      addCriterion("c_version is null");
      return (Criteria) this;
    }

    public Criteria andCVersionIsNotNull() {
      addCriterion("c_version is not null");
      return (Criteria) this;
    }

    public Criteria andCVersionEqualTo(String value) {
      addCriterion("c_version =", value, "cVersion");
      return (Criteria) this;
    }

    public Criteria andCVersionNotEqualTo(String value) {
      addCriterion("c_version <>", value, "cVersion");
      return (Criteria) this;
    }

    public Criteria andCVersionGreaterThan(String value) {
      addCriterion("c_version >", value, "cVersion");
      return (Criteria) this;
    }

    public Criteria andCVersionGreaterThanOrEqualTo(String value) {
      addCriterion("c_version >=", value, "cVersion");
      return (Criteria) this;
    }

    public Criteria andCVersionLessThan(String value) {
      addCriterion("c_version <", value, "cVersion");
      return (Criteria) this;
    }

    public Criteria andCVersionLessThanOrEqualTo(String value) {
      addCriterion("c_version <=", value, "cVersion");
      return (Criteria) this;
    }

    public Criteria andCVersionLike(String value) {
      addCriterion("c_version like", value, "cVersion");
      return (Criteria) this;
    }

    public Criteria andCVersionNotLike(String value) {
      addCriterion("c_version not like", value, "cVersion");
      return (Criteria) this;
    }

    public Criteria andCVersionIn(List<String> values) {
      addCriterion("c_version in", values, "cVersion");
      return (Criteria) this;
    }

    public Criteria andCVersionNotIn(List<String> values) {
      addCriterion("c_version not in", values, "cVersion");
      return (Criteria) this;
    }

    public Criteria andCVersionBetween(String value1, String value2) {
      addCriterion("c_version between", value1, value2, "cVersion");
      return (Criteria) this;
    }

    public Criteria andCVersionNotBetween(String value1, String value2) {
      addCriterion("c_version not between", value1, value2, "cVersion");
      return (Criteria) this;
    }

    public Criteria andCnvdIdIsNull() {
      addCriterion("cnvd_id is null");
      return (Criteria) this;
    }

    public Criteria andCnvdIdIsNotNull() {
      addCriterion("cnvd_id is not null");
      return (Criteria) this;
    }

    public Criteria andCnvdIdEqualTo(String value) {
      addCriterion("cnvd_id =", value, "cnvdId");
      return (Criteria) this;
    }

    public Criteria andCnvdIdNotEqualTo(String value) {
      addCriterion("cnvd_id <>", value, "cnvdId");
      return (Criteria) this;
    }

    public Criteria andCnvdIdGreaterThan(String value) {
      addCriterion("cnvd_id >", value, "cnvdId");
      return (Criteria) this;
    }

    public Criteria andCnvdIdGreaterThanOrEqualTo(String value) {
      addCriterion("cnvd_id >=", value, "cnvdId");
      return (Criteria) this;
    }

    public Criteria andCnvdIdLessThan(String value) {
      addCriterion("cnvd_id <", value, "cnvdId");
      return (Criteria) this;
    }

    public Criteria andCnvdIdLessThanOrEqualTo(String value) {
      addCriterion("cnvd_id <=", value, "cnvdId");
      return (Criteria) this;
    }

    public Criteria andCnvdIdLike(String value) {
      addCriterion("cnvd_id like", value, "cnvdId");
      return (Criteria) this;
    }

    public Criteria andCnvdIdNotLike(String value) {
      addCriterion("cnvd_id not like", value, "cnvdId");
      return (Criteria) this;
    }

    public Criteria andCnvdIdIn(List<String> values) {
      addCriterion("cnvd_id in", values, "cnvdId");
      return (Criteria) this;
    }

    public Criteria andCnvdIdNotIn(List<String> values) {
      addCriterion("cnvd_id not in", values, "cnvdId");
      return (Criteria) this;
    }

    public Criteria andCnvdIdBetween(String value1, String value2) {
      addCriterion("cnvd_id between", value1, value2, "cnvdId");
      return (Criteria) this;
    }

    public Criteria andCnvdIdNotBetween(String value1, String value2) {
      addCriterion("cnvd_id not between", value1, value2, "cnvdId");
      return (Criteria) this;
    }

    public Criteria andCveIdIsNull() {
      addCriterion("cve_id is null");
      return (Criteria) this;
    }

    public Criteria andCveIdIsNotNull() {
      addCriterion("cve_id is not null");
      return (Criteria) this;
    }

    public Criteria andCveIdEqualTo(String value) {
      addCriterion("cve_id =", value, "cveId");
      return (Criteria) this;
    }

    public Criteria andCveIdNotEqualTo(String value) {
      addCriterion("cve_id <>", value, "cveId");
      return (Criteria) this;
    }

    public Criteria andCveIdGreaterThan(String value) {
      addCriterion("cve_id >", value, "cveId");
      return (Criteria) this;
    }

    public Criteria andCveIdGreaterThanOrEqualTo(String value) {
      addCriterion("cve_id >=", value, "cveId");
      return (Criteria) this;
    }

    public Criteria andCveIdLessThan(String value) {
      addCriterion("cve_id <", value, "cveId");
      return (Criteria) this;
    }

    public Criteria andCveIdLessThanOrEqualTo(String value) {
      addCriterion("cve_id <=", value, "cveId");
      return (Criteria) this;
    }

    public Criteria andCveIdLike(String value) {
      addCriterion("cve_id like", value, "cveId");
      return (Criteria) this;
    }

    public Criteria andCveIdNotLike(String value) {
      addCriterion("cve_id not like", value, "cveId");
      return (Criteria) this;
    }

    public Criteria andCveIdIn(List<String> values) {
      addCriterion("cve_id in", values, "cveId");
      return (Criteria) this;
    }

    public Criteria andCveIdNotIn(List<String> values) {
      addCriterion("cve_id not in", values, "cveId");
      return (Criteria) this;
    }

    public Criteria andCveIdBetween(String value1, String value2) {
      addCriterion("cve_id between", value1, value2, "cveId");
      return (Criteria) this;
    }

    public Criteria andCveIdNotBetween(String value1, String value2) {
      addCriterion("cve_id not between", value1, value2, "cveId");
      return (Criteria) this;
    }

    public Criteria andDisclosureDateIsNull() {
      addCriterion("disclosure_date is null");
      return (Criteria) this;
    }

    public Criteria andDisclosureDateIsNotNull() {
      addCriterion("disclosure_date is not null");
      return (Criteria) this;
    }

    public Criteria andDisclosureDateEqualTo(Date value) {
      addCriterionForJDBCDate("disclosure_date =", value, "disclosureDate");
      return (Criteria) this;
    }

    public Criteria andDisclosureDateNotEqualTo(Date value) {
      addCriterionForJDBCDate("disclosure_date <>", value, "disclosureDate");
      return (Criteria) this;
    }

    public Criteria andDisclosureDateGreaterThan(Date value) {
      addCriterionForJDBCDate("disclosure_date >", value, "disclosureDate");
      return (Criteria) this;
    }

    public Criteria andDisclosureDateGreaterThanOrEqualTo(Date value) {
      addCriterionForJDBCDate("disclosure_date >=", value, "disclosureDate");
      return (Criteria) this;
    }

    public Criteria andDisclosureDateLessThan(Date value) {
      addCriterionForJDBCDate("disclosure_date <", value, "disclosureDate");
      return (Criteria) this;
    }

    public Criteria andDisclosureDateLessThanOrEqualTo(Date value) {
      addCriterionForJDBCDate("disclosure_date <=", value, "disclosureDate");
      return (Criteria) this;
    }

    public Criteria andDisclosureDateIn(List<Date> values) {
      addCriterionForJDBCDate("disclosure_date in", values, "disclosureDate");
      return (Criteria) this;
    }

    public Criteria andDisclosureDateNotIn(List<Date> values) {
      addCriterionForJDBCDate("disclosure_date not in", values, "disclosureDate");
      return (Criteria) this;
    }

    public Criteria andDisclosureDateBetween(Date value1, Date value2) {
      addCriterionForJDBCDate("disclosure_date between", value1, value2, "disclosureDate");
      return (Criteria) this;
    }

    public Criteria andDisclosureDateNotBetween(Date value1, Date value2) {
      addCriterionForJDBCDate("disclosure_date not between", value1, value2, "disclosureDate");
      return (Criteria) this;
    }

    public Criteria andSubmitTimeIsNull() {
      addCriterion("submit_time is null");
      return (Criteria) this;
    }

    public Criteria andSubmitTimeIsNotNull() {
      addCriterion("submit_time is not null");
      return (Criteria) this;
    }

    public Criteria andSubmitTimeEqualTo(Date value) {
      addCriterionForJDBCDate("submit_time =", value, "submitTime");
      return (Criteria) this;
    }

    public Criteria andSubmitTimeNotEqualTo(Date value) {
      addCriterionForJDBCDate("submit_time <>", value, "submitTime");
      return (Criteria) this;
    }

    public Criteria andSubmitTimeGreaterThan(Date value) {
      addCriterionForJDBCDate("submit_time >", value, "submitTime");
      return (Criteria) this;
    }

    public Criteria andSubmitTimeGreaterThanOrEqualTo(Date value) {
      addCriterionForJDBCDate("submit_time >=", value, "submitTime");
      return (Criteria) this;
    }

    public Criteria andSubmitTimeLessThan(Date value) {
      addCriterionForJDBCDate("submit_time <", value, "submitTime");
      return (Criteria) this;
    }

    public Criteria andSubmitTimeLessThanOrEqualTo(Date value) {
      addCriterionForJDBCDate("submit_time <=", value, "submitTime");
      return (Criteria) this;
    }

    public Criteria andSubmitTimeIn(List<Date> values) {
      addCriterionForJDBCDate("submit_time in", values, "submitTime");
      return (Criteria) this;
    }

    public Criteria andSubmitTimeNotIn(List<Date> values) {
      addCriterionForJDBCDate("submit_time not in", values, "submitTime");
      return (Criteria) this;
    }

    public Criteria andSubmitTimeBetween(Date value1, Date value2) {
      addCriterionForJDBCDate("submit_time between", value1, value2, "submitTime");
      return (Criteria) this;
    }

    public Criteria andSubmitTimeNotBetween(Date value1, Date value2) {
      addCriterionForJDBCDate("submit_time not between", value1, value2, "submitTime");
      return (Criteria) this;
    }

    public Criteria andLevelIsNull() {
      addCriterion("level is null");
      return (Criteria) this;
    }

    public Criteria andLevelIsNotNull() {
      addCriterion("level is not null");
      return (Criteria) this;
    }

    public Criteria andLevelEqualTo(Integer value) {
      addCriterion("level =", value, "level");
      return (Criteria) this;
    }

    public Criteria andLevelNotEqualTo(Integer value) {
      addCriterion("level <>", value, "level");
      return (Criteria) this;
    }

    public Criteria andLevelGreaterThan(Integer value) {
      addCriterion("level >", value, "level");
      return (Criteria) this;
    }

    public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
      addCriterion("level >=", value, "level");
      return (Criteria) this;
    }

    public Criteria andLevelLessThan(Integer value) {
      addCriterion("level <", value, "level");
      return (Criteria) this;
    }

    public Criteria andLevelLessThanOrEqualTo(Integer value) {
      addCriterion("level <=", value, "level");
      return (Criteria) this;
    }

    public Criteria andLevelIn(List<Integer> values) {
      addCriterion("level in", values, "level");
      return (Criteria) this;
    }

    public Criteria andLevelNotIn(List<Integer> values) {
      addCriterion("level not in", values, "level");
      return (Criteria) this;
    }

    public Criteria andLevelBetween(Integer value1, Integer value2) {
      addCriterion("level between", value1, value2, "level");
      return (Criteria) this;
    }

    public Criteria andLevelNotBetween(Integer value1, Integer value2) {
      addCriterion("level not between", value1, value2, "level");
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
   * This class was generated by MyBatis Generator. This class corresponds to the database table
   * vuln
   *
   * @mbg.generated do_not_delete_during_merge
   */
  public static class Criteria extends GeneratedCriteria {

    protected Criteria() {
      super();
    }
  }

  /**
   * This class was generated by MyBatis Generator. This class corresponds to the database table
   * vuln
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
