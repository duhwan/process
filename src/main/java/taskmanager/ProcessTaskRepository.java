package taskmanager;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="processTasks", path="processTasks")
public interface ProcessTaskRepository extends PagingAndSortingRepository<ProcessTask, Long>{


}
