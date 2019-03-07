package com.avinash;

public class BedRoomBuilder implements Builder {
	

	private int height;
	private int width;
	private int floorNumber;
	private String wallColor;
	private int numberOfWindows;
	private int numberOfDoors;
	private boolean isDouble;
	private boolean isSuite;
	
	public BedRoomBuilder() {
		
	}
	
	/* (non-Javadoc)
	 * @see com.avinash.Builder#setHeight(int)
	 */
	@Override
	public Builder setHeight(int height) {
		this.height = height;
		return this;
	}
	/* (non-Javadoc)
	 * @see com.avinash.Builder#setWidth(int)
	 */
	@Override
	public Builder setWidth(int width) {
		this.width = width;
		return this;
	}
	/* (non-Javadoc)
	 * @see com.avinash.Builder#setFloorNumber(int)
	 */
	@Override
	public Builder setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
		return this;
	}
	/* (non-Javadoc)
	 * @see com.avinash.Builder#setWallColor(java.lang.String)
	 */
	@Override
	public Builder setWallColor(String wallColor) {
		this.wallColor = wallColor;
		return this;
	}
	/* (non-Javadoc)
	 * @see com.avinash.Builder#setNumberOfWindows(int)
	 */
	@Override
	public Builder setNumberOfWindows(int numberOfWindows) {
		this.numberOfWindows = numberOfWindows;
		return this;
	}
	/* (non-Javadoc)
	 * @see com.avinash.Builder#setNumberOfDoors(int)
	 */
	@Override
	public Builder setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
		return this;
	}
	public Builder setDouble(boolean isDouble) {
		this.isDouble = isDouble;
		return this;
	}
	public Builder setSuite(boolean isSuite) {
		this.isSuite = isSuite;
		return this;
	}
	
	@Override
	public BedRoom build() {
		return new BedRoom(height, width, floorNumber, wallColor, numberOfWindows, numberOfDoors, isDouble, isSuite);
				
	}

}
