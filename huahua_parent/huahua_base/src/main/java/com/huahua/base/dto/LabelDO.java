package com.huahua.base.dto;

public class LabelDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_label.id
     *
     * @mbg.generated Thu Apr 11 14:58:54 CST 2019
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_label.labelname
     *
     * @mbg.generated Thu Apr 11 14:58:54 CST 2019
     */
    private String labelname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_label.state
     *
     * @mbg.generated Thu Apr 11 14:58:54 CST 2019
     */
    private String state;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_label.count
     *
     * @mbg.generated Thu Apr 11 14:58:54 CST 2019
     */
    private Long count;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_label.recommend
     *
     * @mbg.generated Thu Apr 11 14:58:54 CST 2019
     */
    private String recommend;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_label.fans
     *
     * @mbg.generated Thu Apr 11 14:58:54 CST 2019
     */
    private Long fans;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_label.id
     *
     * @return the value of tb_label.id
     *
     * @mbg.generated Thu Apr 11 14:58:54 CST 2019
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_label.id
     *
     * @param id the value for tb_label.id
     *
     * @mbg.generated Thu Apr 11 14:58:54 CST 2019
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_label.labelname
     *
     * @return the value of tb_label.labelname
     *
     * @mbg.generated Thu Apr 11 14:58:54 CST 2019
     */
    public String getLabelname() {
        return labelname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_label.labelname
     *
     * @param labelname the value for tb_label.labelname
     *
     * @mbg.generated Thu Apr 11 14:58:54 CST 2019
     */
    public void setLabelname(String labelname) {
        this.labelname = labelname == null ? null : labelname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_label.state
     *
     * @return the value of tb_label.state
     *
     * @mbg.generated Thu Apr 11 14:58:54 CST 2019
     */
    public String getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_label.state
     *
     * @param state the value for tb_label.state
     *
     * @mbg.generated Thu Apr 11 14:58:54 CST 2019
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_label.count
     *
     * @return the value of tb_label.count
     *
     * @mbg.generated Thu Apr 11 14:58:54 CST 2019
     */
    public Long getCount() {
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_label.count
     *
     * @param count the value for tb_label.count
     *
     * @mbg.generated Thu Apr 11 14:58:54 CST 2019
     */
    public void setCount(Long count) {
        this.count = count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_label.recommend
     *
     * @return the value of tb_label.recommend
     *
     * @mbg.generated Thu Apr 11 14:58:54 CST 2019
     */
    public String getRecommend() {
        return recommend;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_label.recommend
     *
     * @param recommend the value for tb_label.recommend
     *
     * @mbg.generated Thu Apr 11 14:58:54 CST 2019
     */
    public void setRecommend(String recommend) {
        this.recommend = recommend == null ? null : recommend.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_label.fans
     *
     * @return the value of tb_label.fans
     *
     * @mbg.generated Thu Apr 11 14:58:54 CST 2019
     */
    public Long getFans() {
        return fans;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_label.fans
     *
     * @param fans the value for tb_label.fans
     *
     * @mbg.generated Thu Apr 11 14:58:54 CST 2019
     */
    public void setFans(Long fans) {
        this.fans = fans;
    }
}