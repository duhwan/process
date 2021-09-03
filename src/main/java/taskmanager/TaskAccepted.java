package taskmanager;
import java.util.Date;

public class TaskAccepted extends AbstractEvent {

    private Long id;
    private Long requestTaskId;
    private Date startDate;
    private Long processTaskManagerId;
    private String status;

    public TaskAccepted(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getRequestTaskId() {
        return requestTaskId;
    }

    public void setRequestTaskId(Long requestTaskId) {
        this.requestTaskId = requestTaskId;
    }
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public Long getProcessTaskManagerId() {
        return processTaskManagerId;
    }

    public void setProcessTaskManagerId(Long processTaskManagerId) {
        this.processTaskManagerId = processTaskManagerId;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
