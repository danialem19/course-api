package io.javabrains.springbootquickstart.courseapi.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
 List<Topic> topics =	new ArrayList<>(Arrays.asList(
			new Topic("spring", "Spring Framework", "Spring Framework Description"),
			new Topic("java", "Java Framework", "Java Framework Description"),
		    new Topic("Eclipse", "Eclipse Framework", "Eclipse Framework Description")));

 public List<Topic> getAllTopics(){
	return topics;
}
 
 public Topic getTopic(String id){
	 return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
}

public void addTopic(Topic topic) {
	topics.add(topic);
}

public void updateTopic(Topic topic, String id) {
	for(int i = 0;  i < topics.size(); i++) {
		Topic t = topics.get(i);
		if(topic.getId().equals(t.getId())) {
			topics.set(i, topic);
		}
	}
}

public void deleteTopic(String id) {
	for(int i = 0;  i < topics.size(); i++) {
		Topic t = topics.get(i);
		if(id.equals(t.getId())) {
			topics.remove(i);
		}
	}
}
}
