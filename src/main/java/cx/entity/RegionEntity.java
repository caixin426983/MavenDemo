package cx.entity;

/**
 * Created by Administrator on 2017-6-20.
 */
public class RegionEntity {

    /**
     * 区位码
     */
    private String CODE;

    /**
     * 国家代码
     */
    private String country_code;

    /**
     * 地区名称英文
     */
    private String region_name_e;

    /**
     * 地区名称中文
     */
    private  String region_name_c;

    /**
     * 级别
     */
    private String level;

    /**
     * 上级地区
     */
    private String upper_region;


    public String getCODE() {
        return CODE;
    }

    public void setCODE(String CODE) {
        this.CODE = CODE;
    }

    public String getCountry_code() {
        return country_code;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    public String getRegion_name_e() {
        return region_name_e;
    }

    public void setRegion_name_e(String region_name_e) {
        this.region_name_e = region_name_e;
    }

    public String getRegion_name_c() {
        return region_name_c;
    }

    public void setRegion_name_c(String region_name_c) {
        this.region_name_c = region_name_c;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getUpper_region() {
        return upper_region;
    }

    public void setUpper_region(String upper_region) {
        this.upper_region = upper_region;
    }

    @Override
    public String toString() {
        return "RegionEntity{" +
                "CODE='" + CODE + '\'' +
                ", country_code='" + country_code + '\'' +
                ", region_name_e='" + region_name_e + '\'' +
                ", region_name_c='" + region_name_c + '\'' +
                ", level='" + level + '\'' +
                ", upper_region='" + upper_region + '\'' +
                '}';
    }
}
