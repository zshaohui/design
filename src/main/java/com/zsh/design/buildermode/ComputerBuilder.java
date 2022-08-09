package com.zsh.design.buildermode;

public class ComputerBuilder {
	private String cpu;// 必须
	private String ram;// 必须
	private int usbCount;// 可选
	private String keyboard;// 可选
	private String display;// 可选

	public static class Builder {
		private String cpu;// 必须
		private String ram;// 必须
		private int usbCount;// 可选
		private String keyboard;// 可选
		private String display;// 可选

		public Builder(String cup, String ram) {
			this.cpu = cup;
			this.ram = ram;
		}

		public Builder setUsbCount(int usbCount) {
			this.usbCount = usbCount;
			return this;
		}

		public Builder setKeyboard(String keyboard) {
			this.keyboard = keyboard;
			return this;
		}

		public Builder setDisplay(String display) {
			this.display = display;
			return this;
		}

		public ComputerBuilder build() {
			return new ComputerBuilder(this);
		}

	}

	public ComputerBuilder(Builder builder) {
		this.cpu = builder.cpu;
		this.ram = builder.ram;
		this.usbCount = builder.usbCount;
		this.keyboard = builder.keyboard;
		this.display = builder.display;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public int getUsbCount() {
		return usbCount;
	}

	public void setUsbCount(int usbCount) {
		this.usbCount = usbCount;
	}

	public String getKeyboard() {
		return keyboard;
	}

	public void setKeyboard(String keyboard) {
		this.keyboard = keyboard;
	}

	public String getDisplay() {
		return display;
	}

	public void setDisplay(String display) {
		this.display = display;
	}
}
