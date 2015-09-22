package com.example.myapplication3.app.models;

import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by omar on 9/22/15.
 */
public class GlobalModel {
    private List<Organization> organizations;
    private JsonElement orgTypes;
    private JsonElement currencies;
    private JsonElement regions;
    private JsonElement cities;
    private String sourceId;
    private String date;

    private List<PairedObject> orgTypesReal;
    private List<PairedObject> currenciesReal;
    private List<PairedObject> regionsReal;
    private List<PairedObject> citiesReal;


    public void setOrganizations(List<Organization> organizations) {
        this.organizations = organizations;
    }


    public void setOrgTypes(JsonElement orgTypes) {
        this.orgTypes = orgTypes;
    }

    public void setCurrencies(JsonElement currencies) {
        this.currencies = currencies;

    }

    public void setRegions(JsonElement regionsJSon) {
        this.regions = regionsJSon;

    }

    public void setCities(JsonElement citiesJSon) {
        this.cities = citiesJSon;

    }

    public void deresialize(){
        this.orgTypesReal = CustomDeserializer.getPairedObjectList(orgTypes);
        this.currenciesReal = CustomDeserializer.getPairedObjectList(currencies);
        this.regionsReal = CustomDeserializer.getPairedObjectList(regions);
        this.citiesReal = CustomDeserializer.getPairedObjectList(cities);

        for(Organization item : organizations)
            item.deserialize();
    }

    public List<Organization> getOrganizations() {
        return organizations;
    }

    public List<PairedObject> getOrgTypes() {
        return orgTypesReal;
    }

    public List<PairedObject> getCurrencies() {
        return currenciesReal;
    }

    public List<PairedObject> getRegions() {
        return regionsReal;
    }

    public List<PairedObject> getCities() {
        return citiesReal;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
