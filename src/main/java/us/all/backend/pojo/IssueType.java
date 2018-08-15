package us.all.backend.pojo;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

public class IssueType {
    @Id
    @GeneratedValue
    private Long id;
    private String issueEnvironment;
    private String issueCategory;
    private String typeOfIssue;
    private String reportRecipient;
    @OneToMany(mappedBy = "issue")
    private Collection<ObstacleReport> obstacleReports;

    public IssueType(String issueEnvironment, String issueCategory, String typeOfIssue, String reportRecipient) {
        this.issueEnvironment = issueEnvironment;
        this.issueCategory = issueCategory;
        this.typeOfIssue = typeOfIssue;
        this.reportRecipient = reportRecipient;

    }

    public IssueType() {
    }

    public String getIssueEnvironment() {
        return issueEnvironment;
    }

    public String getIssueCategory() {
        return issueCategory;
    }

    public String getTypeOfIssue() {
        return typeOfIssue;
    }

    public String getReportRecipient() {
        return reportRecipient;
    }

    public Long getId() {
        return id;
    }

    public Collection<ObstacleReport> getObstacleReports() {
        return obstacleReports;
    }

}
