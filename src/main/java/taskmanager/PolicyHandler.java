package taskmanager;

import taskmanager.TaskRequested;
import taskmanager.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class PolicyHandler{
    @Autowired ProcessTaskRepository processTaskRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverTaskRequested_AddProcessTask(@Payload TaskRequested taskRequested){

        if(!taskRequested.validate()) return;

        System.out.println("\n\n##### listener AddProcessTask : " + taskRequested.toJson() + "\n\n");

        ProcessTask processTask = new ProcessTask();
        if(processTask != null){
    
            processTask.setRequestTaskId(taskRequested.getId());
            processTask.setTaskContents(taskRequested.getTaskContents());
            processTask.setDuDate(taskRequested.getDueDate());
            processTask.setRequesterId(taskRequested.getRequesterId());
            processTask.setRequesterName(taskRequested.getRequesterName());
            processTask.setTaskStatus(taskRequested.getTaskStatus());

          // 레파지 토리에 insert
            processTaskRepository.save(processTask);
        }
    }


    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}


}
