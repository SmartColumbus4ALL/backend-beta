package us.all.backend.pojo;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

public class ObstacleReport {
    @Id
    @GeneratedValue
    private Long id;
    private double latitude;
    private double longitude;

    private String streetAddress = null;
    private LocalDate reportDate;
    @ManyToOne
    private IssueType issue;

    public ObstacleReport(double latitude, double longitude, String streetAddress, LocalDate reportDate,
                          IssueType issue) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.reportDate = reportDate;
        this.issue = issue;
    }

    public ObstacleReport() {
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getDate() {
        return reportDate.toString();
    }

    public LocalDate getReportDate() {
        return reportDate;
    }

    public IssueType getIssue() {
        return issue;
    }

    public Long getId() {
        return id;
    }
}
