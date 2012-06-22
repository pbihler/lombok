import java.lang.annotation.*;

class NonEmptyWithRequiredArgsConstructor {
	final String s;
	@lombok.NonEmpty
	int[] a;
	
	@java.beans.ConstructorProperties({"s"})
	@java.lang.SuppressWarnings("all")
	public NonEmptyWithRequiredArgsConstructor(final String s) {
		this.s = s;
	}
	
	@java.lang.SuppressWarnings("all")
	public String getS() {
		return this.s;
	}

	@lombok.NonEmpty
	@java.lang.SuppressWarnings("all")
	public int[] getA() {
		return this.a;
	}

	@java.lang.SuppressWarnings("all")
	public void setA(@lombok.NonEmpty final int[] a) {
		if (a != null && a.length == 0) throw new java.lang.IllegalArgumentException("a must not be empty.");
		this.a = a;
	}
}