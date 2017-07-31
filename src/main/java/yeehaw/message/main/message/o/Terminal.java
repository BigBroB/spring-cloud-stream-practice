package yeehaw.message.main.message.o;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Terminal implements Serializable {

	private String memberId;
	private String equipNo;
	private String pushCode;
	/**
	 * 
	 */
	private String cell;
	/**
	 * 如：android,4.0,huawei p8
	 */
	private String equipOS;

	public Terminal() {

	}

	public Terminal(String memberId, String equipNo, String pushCode, String cell, String equipOS) {

		this.memberId = memberId;
		this.equipNo = equipNo;
		this.pushCode = pushCode;
		this.cell = cell;
		this.equipOS = equipOS;
	}

	/**
	 * @return the memberId
	 */
	public String getMemberId() {
		return memberId;
	}

	/**
	 * @param memberId
	 *            the memberId to set
	 */
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	/**
	 * @return the equipNo
	 */
	public String getEquipNo() {
		return equipNo;
	}

	/**
	 * @param equipNo
	 *            the equipNo to set
	 */
	public void setEquipNo(String equipNo) {
		this.equipNo = equipNo;
	}

	/**
	 * @return the pushCode
	 */
	public String getPushCode() {
		return pushCode;
	}

	/**
	 * @param pushCode
	 *            the pushCode to set
	 */
	public void setPushCode(String pushCode) {
		this.pushCode = pushCode;
	}

	/**
	 * @return the cell
	 */
	public String getCell() {
		return cell;
	}

	/**
	 * @param cell
	 *            the cell to set
	 */
	public void setCell(String cell) {
		this.cell = cell;
	}

	/**
	 * @return the equipOS
	 */
	public String getEquipOS() {
		return equipOS;
	}

	/**
	 * @param equipOS
	 *            the equipOS to set
	 */
	public void setEquipOS(String equipOS) {
		this.equipOS = equipOS;
	}

}
