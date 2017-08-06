package com.comcast.xh.service;

import com.comcast.xh.domain.Campaign;
import com.comcast.xh.util.ErrorConstants;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by skonda004c on 8/5/2017.
 */
@Component
public class AdCampaignServiceImpl implements AdCampaignService {

    Map<String, Campaign> campaigns = new HashMap<>();

    @Override
    public void addCampaign(Campaign campaign) throws Exception {
        if(campaigns.containsKey(campaign.getPartner_id())) {
            throw new Exception(ErrorConstants.ONE_CAMPAIGN_PER_PARTNER);
        }
        else {
            campaigns.put(campaign.getPartner_id(), campaign);
        }
    }

    @Override
    public Iterable<Campaign> getCapaigns() {
        return campaigns.values();
    }

    @Override
    public Campaign getCampaign(String partnerId) throws Exception {
        Campaign campaign = null;
        if(campaigns.containsKey(partnerId)) {
            campaign = campaigns.get(partnerId);
        }

        if(null!=campaign && !StringUtils.isEmpty(campaign.getAd_status()) && "Active".equalsIgnoreCase(campaign.getAd_status())) {
            return campaign;
        }else {
            throw new Exception(ErrorConstants.NO_CAMPAIGN_FOR_PARTNER);
        }
    }

    @Override
    public void updateCampaign(Campaign campaign) throws Exception {
        if(campaigns.containsKey(campaign.getPartner_id())) {
            campaigns.put(campaign.getPartner_id(), campaign);
        }
        else {
            throw new Exception(ErrorConstants.NO_CAMPAIGN_FOUND);
        }
    }

    @Override
    public void deleteCampaign(String partnerId) throws Exception {

            if(campaigns.containsKey(partnerId)) {
                campaigns.remove(partnerId);
            }
            else {
                throw new Exception(ErrorConstants.NO_CAMPAIGN_FOUND);
            }
    }

}
