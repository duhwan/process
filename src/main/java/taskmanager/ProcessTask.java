package taskmanager;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;
import java.util.Date;

@Entity
@Table(name="ProcessTask_table")
public class ProcessTask {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private Long requestTaskId;
    private String taskContents;
    private Date duDate;
    private Date startDate;
    private Date completeDate;
    private Long requesterId;
    private String requesterName;
    private Long processTaskManagerId;
    private String processTaskManagerName;
    private String taskStatus;

    @PostPersist
    public void onPostPersist(){
      
            ProcessTaskAdded processTaskAdded = new ProcessTaskAdded();
            BeanUtils.copyProperties(this, processTaskAdded);
            processTaskAdded.publishAfterCommit();
        
    }

    @PostUpdate
        public void onPostUpdate(){

            if(taskStatus.equals("TASK_STARTED")){ //taskManager가 accept 처리시 
                TaskAccepted taskAccepted = new TaskAccepted();
                BeanUtils.copyProperties(this, taskAccepted);
                taskAccepted.publishAfterCommit();
            }else if(taskStatus.equals("TASK_COMPLETED")){ //taskManager가 accept 처리시 
                TaskCompleted taskcCompleted = new TaskCompleted();
                BeanUtils.copyProperties(this, taskcCompleted);
                taskcCompleted.publishAfterCommit();
            }else if(taskStatus.equals("TASK_CANCELLED")){ //taskManager가 accept 처리시 
                ProcessTaskDeleted processTaskDeleted = new ProcessTaskDeleted();
                BeanUtils.copyProperties(this, processTaskDeleted);
                processTaskDeleted.publishAfterCommit();
            }
        }

            @PostRemove
    public void onPostRemove(){
        ProcessTaskDeleted processTaskDeleted = new ProcessTaskDeleted();
        BeanUtils.copyProperties(this, processTaskDeleted);
        processTaskDeleted.publishAfterCommit();

    }
    @PreRemove
    public void onPreRemove(){
    }
    
    //@PreRemove
   // public void onPreRemove(){
     //   ProcessTaskDeleted processTaskDeleted = new ProcessTaskDeleted();
       // BeanUtils.copyProperties(this, processTaskDeleted);
       // processTaskDeleted.publishAfterCommit();

    //}

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
    public String getTaskContents() {
        return taskContents;
    }

    public void setTaskContents(String taskContents) {
        this.taskContents = taskContents;
    }
    public Date getDuDate() {
        return duDate;
    }

    public void setDuDate(Date duDate) {
        this.duDate = duDate;
    }
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public Date getCompleteDate() {
        return completeDate;
    }

    public void setCompleteDate(Date completeDate) {
        this.completeDate = completeDate;
    }
    public Long getRequesterId() {
        return requesterId;
    }

    public void setRequesterId(Long requesterId) {
        this.requesterId = requesterId;
    }
    public String getRequesterName() {
        return requesterName;
    }

    public void setRequesterName(String requesterName) {
        this.requesterName = requesterName;
    }
    public Long getProcessTaskManagerId() {
        return processTaskManagerId;
    }

    public void setProcessTaskManagerId(Long processTaskManagerId) {
        this.processTaskManagerId = processTaskManagerId;
    }
    public String getProcessTaskManagerName() {
        return processTaskManagerName;
    }

    public void setProcessTaskManagerName(String processTaskManagerName) {
        this.processTaskManagerName = processTaskManagerName;
    }
    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }




}