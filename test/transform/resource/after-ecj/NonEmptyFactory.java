import java.lang.annotation.*;
@lombok.AllArgsConstructor(staticName = "of") class NonEmptyFactory {
  public @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE}) @Retention(RetentionPolicy.CLASS) @interface Nullable {
  }
  @lombok.NonEmpty int i;
  @lombok.NonEmpty String s;
  @lombok.NonEmpty @lombok.NonNull Object o;
  @Nullable @lombok.NonEmpty Object p;
  private @java.lang.SuppressWarnings("all") NonEmptyFactory(final @lombok.NonEmpty int i, final @lombok.NonEmpty String s, final @lombok.NonNull @lombok.NonEmpty Object o, final @Nullable @lombok.NonEmpty Object p) {
    super();
    if (((s != null) && ("".equals(s.toString()) || (((java.lang.Object) s instanceof java.util.Collection) && (java.util.Collection) (java.lang.Object) s.isEmpty()))))
        throw new java.lang.IllegalArgumentException("s must not be empty.");
    if ((o == null))
        throw new java.lang.NullPointerException("o");
    if (((o != null) && ("".equals(o.toString()) || (((java.lang.Object) o instanceof java.util.Collection) && (java.util.Collection) (java.lang.Object) o.isEmpty()))))
        throw new java.lang.IllegalArgumentException("o must not be empty.");
    if (((p != null) && ("".equals(p.toString()) || (((java.lang.Object) p instanceof java.util.Collection) && (java.util.Collection) (java.lang.Object) p.isEmpty()))))
        throw new java.lang.IllegalArgumentException("p must not be empty.");
    this.i = i;
    this.s = s;
    this.o = o;
    this.p = p;
  }
  public static @java.lang.SuppressWarnings("all") NonEmptyFactory of(final @lombok.NonEmpty int i, final @lombok.NonEmpty String s, final @lombok.NonNull @lombok.NonEmpty Object o, final @Nullable @lombok.NonEmpty Object p) {
    return new NonEmptyFactory(i, s, o, p);
  }
}

