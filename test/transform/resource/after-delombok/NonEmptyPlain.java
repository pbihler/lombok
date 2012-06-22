import java.lang.annotation.*;

class NonEmptyPlain {
	@lombok.NonEmpty
	int i;
	@lombok.NonEmpty
	String s;
	@lombok.NonEmpty
	@lombok.NonNull
	Object o;
	@Nullable
	@lombok.NonEmpty
	Object p;
	@lombok.NonEmpty
	int[] a;
	
	@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE})
	@Retention(RetentionPolicy.CLASS)
	public @interface Nullable {
	}
	
	@java.beans.ConstructorProperties({"i", "s", "o", "p", "a"})
	@java.lang.SuppressWarnings("all")
	public NonEmptyPlain(@lombok.NonEmpty final int i, @lombok.NonEmpty final String s, @lombok.NonNull @lombok.NonEmpty final Object o, @Nullable @lombok.NonEmpty final Object p, @lombok.NonEmpty final int[] a) {
		if (s != null && ("".equals(s.toString()) || s instanceof java.util.Collection && ((java.util.Collection)s).isEmpty())) throw new java.lang.InvalidArgumentException("s must not be empty.");
		if (o == null) throw new java.lang.NullPointerException("o");
		if (o != null && ("".equals(o.toString()) || o instanceof java.util.Collection && ((java.util.Collection)o).isEmpty())) throw new java.lang.InvalidArgumentException("o must not be empty.");
		if (p != null && ("".equals(p.toString()) || p instanceof java.util.Collection && ((java.util.Collection)p).isEmpty())) throw new java.lang.InvalidArgumentException("p must not be empty.");
		if (a != null && a.length == 0) throw new java.lang.InvalidArgumentException("a must not be empty.");
		this.i = i;
		this.s = s;
		this.o = o;
		this.p = p;
		this.a = a;
	}
	
	@lombok.NonEmpty
	@java.lang.SuppressWarnings("all")
	public int getI() {
		return this.i;
	}
	
	@lombok.NonEmpty
	@java.lang.SuppressWarnings("all")
	public String getS() {
		return this.s;
	}

	@lombok.NonNull
	@lombok.NonEmpty
	@java.lang.SuppressWarnings("all")
	public Object getO() {
		return this.o;
	}
	
	@Nullable
	@lombok.NonEmpty
	@java.lang.SuppressWarnings("all")
	public Object getP() {
		return this.p;
	}
	
	@lombok.NonEmpty
	@java.lang.SuppressWarnings("all")
	public int[] getA() {
		return this.a;
	}
	
	@java.lang.SuppressWarnings("all")
	public void setI(@lombok.NonEmpty final int i) {
		this.i = i;
	}

	@java.lang.SuppressWarnings("all")
	public void setS(@lombok.NonEmpty final String s) {
		if (s != null && ("".equals(s.toString()) || s instanceof java.util.Collection && ((java.util.Collection)s).isEmpty())) throw new java.lang.InvalidArgumentException("s must not be empty.");
		this.s = s;
	}
	
	@java.lang.SuppressWarnings("all")
	public void setO(@lombok.NonNull @lombok.NonEmpty final Object o) {
		if (o == null) throw new java.lang.NullPointerException("o");
		if (o != null && ("".equals(o.toString()) || o instanceof java.util.Collection && ((java.util.Collection)o).isEmpty())) throw new java.lang.InvalidArgumentException("o must not be empty.");
		this.o = o;
	}

	@java.lang.SuppressWarnings("all")
	public void setP(@Nullable @lombok.NonEmpty final Object p) {
		if (p != null && ("".equals(p.toString()) || p instanceof java.util.Collection && ((java.util.Collection)p).isEmpty())) throw new java.lang.InvalidArgumentException("p must not be empty.");
		this.p = p;
	}

	@java.lang.SuppressWarnings("all")
	public void setA(@lombok.NonEmpty final int[] a) {
		if (a != null && a.length == 0) throw new java.lang.InvalidArgumentException("a must not be empty.");
		this.a = a;
	}
}
