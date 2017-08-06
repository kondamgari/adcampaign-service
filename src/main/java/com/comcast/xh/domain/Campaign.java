package com.comcast.xh.domain;

/**
 * Created by skonda004c on 8/5/2017.
 *##########################################
 *"partner_id": "unique_string_representing_partner',
 "duration": "int_representing_campaign_duration_in_seconds_from_now"
 "ad_content": "string_of_content_to_display_as_ad",
 "ad_title": "string_of_title_to_display",
 "ad_status": “string_of_status_indicating_Active_or_Inactive”
 #############################################
 */
public class Campaign {
    int duration;
    String partner_id;
    String ad_content;
    String ad_title;
    String ad_status;

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getPartner_id() {
        return partner_id;
    }

    public void setPartner_id(String partner_id) {
        this.partner_id = partner_id;
    }

    public String getAd_content() {
        return ad_content;
    }

    public void setAd_content(String ad_content) {
        this.ad_content = ad_content;
    }

    public String getAd_title() {
        return ad_title;
    }

    public void setAd_title(String ad_title) {
        this.ad_title = ad_title;
    }

    public String getAd_status() {
        return ad_status;
    }

    public void setAd_status(String ad_status) {
        this.ad_status = ad_status;
    }
}
