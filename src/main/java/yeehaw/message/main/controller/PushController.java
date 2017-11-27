package yeehaw.message.main.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import team.union.tool.exception.BaseException;
import yeehaw.message.main.MessageSender;
import yeehaw.message.main.message.o.BaseMessage;
import yeehaw.message.main.msgstream.MessageClient;

@RestController
public class PushController {
	
	@Autowired
	MessageClient messageClient;
	@Autowired
	MessageSender messageSender;
	
	@RequestMapping("/push")
	public String push(@RequestBody BaseMessage message) {
		try {
			Map<String, String> options = new HashMap<String, String>();
			options.put("model", "1");
			options.put("url", "http://baidu.com");
			message.setOptions(options);
			messageSender.push(message);
//			TextMessage test = new TextMessage();
//			test.setTitle("test.");
//			messageSender.sendSM(test);
//			messageSender.sendChallenge("test", "test", "110", "msg");
//			Terminal terminal = new Terminal();
//			terminal.setCell("110");
//			messageSender.bind(terminal);
		} catch (BaseException e) {
			e.printStackTrace();
//		} catch (UnrecognizableClassException e) {
//			e.printStackTrace();
		}
//		messageClient.push().send(MessageBuilder.withPayload("asdasd").build());
//		messageClient.bind().send(MessageBuilder.withPayload("asdasd").build());
//		messageClient.challenge().send(MessageBuilder.withPayload("asdasd").build());
//		messageClient.sms().send(MessageBuilder.withPayload("asdasd").build());
		return "ok";
	}
	
	
	
	
	
	
}
