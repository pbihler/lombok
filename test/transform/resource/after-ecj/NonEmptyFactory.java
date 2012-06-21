import java.lang.annotation.*;
@lombok.AllArgsConstructor(staticName = "of") class NonEmptyPlain {
  public @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE}) @Retention(RetentionPolicy.CLASS) @interface Nullable {
  }
  @lombok.NonEmpty int i;
  @lombok.NonEmpty String s;
  @lombok.NonEmpty @lombok.NonNull Object o;
  @Nullable @lombok.NonEmpty Object p;
  public @java.beans.ConstructorProperties({"i", "s", "o", "p"}) @java.lang.SuppressWarnings("all") NonEmptyFactory(final @lombok.NonEmpty int i, final @lombok.NonEmpty String s, final @lombok.NonNull @lombok.NonEmpty Object o, final @Nullable @lombok.NonEmpty Object p) {
    super();
    if ((s != null) && (("".equals(s.toString())) || ((s instanceof java.util.Collection) && (((java.util.Collection)s).isEmpty())))))
	    throw new java.lang.InvalidArgumentException("s must not be empty.");
	if ((o == null))
	    throw new java.lang.NullPointerException("o");
	if ((o != null) && (("".equals(o.toString())) || ((o instanceof java.util.Collection) && (((java.util.Collection)o).isEmpty())))))
	    throw new java.lang.InvalidArgumentException("o must not be empty.");
	if ((p != null) && (("".equals(p.toString())) || ((p instanceof java.util.Collection) && (((java.util.Collection)p).isEmpty())))))
	    throw new java.lang.InvalidArgumentException("p must not be empty.");
    this.i = i;
    this.s = s;
    this.o = o;
    this.p = p;
  }
  public static @java.lang.SuppressWarnings("all") NonEmptyFactory of(@lombok.NonEmpty final int i, @lombok.NonEmpty final String s, @lombok.NonNull @lombok.NonEmpty final Object o, @Nullable @lombok.NonEmpty final Object p) {
	  return new NonEmptyFactory(i, s, o, p);
  }
}