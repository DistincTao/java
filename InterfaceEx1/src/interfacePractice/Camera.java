package interfacePractice;

//public interface Camera {
//	public abstract void calling(); // 추상 메소드 (선언부는 있어야 하지만, 구현부 / body 는 없어야 한다)
//	void receiving(); // public abstract 생략 가능
//}

public abstract class Camera {
	public abstract void takingPic();
	abstract void zoomIn();
	abstract void zoomOut();
}
