package com.comcast.xh.service;

import com.comcast.xh.domain.Campaign;

/**
 * Created by skonda004c on 8/5/2017.
 */
public interface AdCampaignService {

    public void addCampaign(Campaign campaign) throws Exception;
    public Iterable<Campaign> getCapaigns();
    public Campaign getCampaign(String partnerId) throws Exception;
    public void updateCampaign(Campaign campaign) throws Exception;
    public void deleteCampaign(String partnerId) throws Exception;

}
