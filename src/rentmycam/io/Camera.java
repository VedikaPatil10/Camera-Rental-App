package rentmycam.io;
import java.util.*;

class Camera {
	int cameraId;
	String brand;
	String model;
	double Price;
	boolean status;

	public Camera(int cameraId, String brand, String model, double perDayPrice, boolean Available) {
		this.cameraId = cameraId;
		this.brand = brand;
		this.model = model;
		this.Price = perDayPrice;
		this.status = Available;
	}

	@Override
	public String toString() {
		return "Camera [cameraId=" + cameraId + ", brand=" + brand + ", model=" + model + ", Price=" + Price
				+ ", status=" + status + "]";
	}

	public int getCameraId() {
		return cameraId;
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public double getPerDayPrice() {
		return Price;
	}

	public boolean isAvailable() {
		return status;
	}

	public void setAvailable(boolean Available) {
		status = Available;
	}
}

