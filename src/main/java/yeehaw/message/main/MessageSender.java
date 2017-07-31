package yeehaw.message.main;

import cn.com.inlee.utils.exception.ThirdAPIException;
import cn.com.inlee.utils.exception.UnrecognizableClassException;
import cn.com.inlee.utils.response.ClientResponse;
import yeehaw.message.main.message.o.IMessage;
import yeehaw.message.main.message.o.Terminal;
import yeehaw.message.main.message.o.TextMessage;

public interface MessageSender {

	/**
	 * 终端绑定
	 * 
	 * @param terminal
	 * @return
	 * @throws ThirdAPIException
	 */
	public ClientResponse bind(Terminal terminal) throws ThirdAPIException;

	/**
	 * 发送短信随机码
	 * 
	 * @param sn
	 *            业务系统消息流水号
	 * @param source
	 *            业务系统代码
	 * @param cell
	 *            手机号
	 * @param text
	 *            文本内容
	 * @return
	 * 
	 * @throws ThirdAPIException
	 */
	public ClientResponse sendChallenge(String sn, String source, String cell, String text) throws ThirdAPIException;

	/**
	 * 发送短信
	 * 
	 * @param message
	 * @return
	 * @throws ThirdAPIException
	 * @throws UnrecognizableClassException
	 */
	public ClientResponse sendSM(TextMessage message) throws ThirdAPIException, UnrecognizableClassException;

	/**
	 * 推送信息
	 * 
	 * @param message
	 * @return
	 * @throws ThirdAPIException
	 */
	public ClientResponse push(IMessage message) throws ThirdAPIException;

	/**
	 * 异步推送信息
	 * 
	 * @param message
	 * @throws ThirdAPIException
	 */
	public void pushAsyn(IMessage message) throws ThirdAPIException;

}
