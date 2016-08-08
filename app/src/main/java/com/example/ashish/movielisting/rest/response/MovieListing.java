
package com.example.ashish.movielisting.rest.response;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class MovieListing {

    @SerializedName("page")
    private Integer page;

    @SerializedName("results")
    private ArrayList<Result> results = new ArrayList<Result>();

    @SerializedName("dates")
    private Dates dates;

    @SerializedName("total_pages")
    private Integer totalPages;

    @SerializedName("total_results")
    private Integer totalResults;

    /**
     * @return The page
     */
    public Integer getPage() {
        return page;
    }

    /**
     * @param page The page
     */
    public void setPage(Integer page) {
        this.page = page;
    }

    /**
     * @return The results
     */
    public ArrayList<Result> getResults() {
        return results;
    }

    /**
     * @param results The results
     */
    public void setResults(ArrayList<Result> results) {
        this.results = results;
    }

    /**
     * @return The dates
     */
    public Dates getDates() {
        return dates;
    }

    /**
     * @param dates The dates
     */
    public void setDates(Dates dates) {
        this.dates = dates;
    }

    /**
     * @return The totalPages
     */
    public Integer getTotalPages() {
        return totalPages;
    }

    /**
     * @param totalPages The total_pages
     */
    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    /**
     * @return The totalResults
     */
    public Integer getTotalResults() {
        return totalResults;
    }

    /**
     * @param totalResults The total_results
     */
    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

}
