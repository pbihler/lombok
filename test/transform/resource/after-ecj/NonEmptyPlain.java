import java.lang.annotation.*;
@lombok.AllArgsConstructor @lombok.Getter @lombok.Setter class NonEmptyPlain {
  public @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE}) @Retention(RetentionPolicy.CLASS) @interface Nullable {
  }
  @lombok.NonEmpty int i;
  @lombok.NonEmpty String s;
  @lombok.NonEmpty @lombok.NonNull Object o;
  @Nullable @lombok.NonEmpty Object p;
  @lombok.NonEmpty int[] a;
  public @java.beans.ConstructorProperties({"i", "s", "o", "p", "a"}) @java.lang.SuppressWarnings("all") NonEmptyPlain(final @lombok.NonEmpty int i, final @lombok.NonEmpty String s, final @lombok.NonNull @lombok.NonEmpty Object o, final @Nullable @lombok.NonEmpty Object p, final @lombok.NonEmpty int[] a) {
    super();
    if (((s != null) && ("".equals(s.toString()) || (((java.lang.Object) s instanceof java.util.Collection) && (java.util.Collection) (java.lang.Object) s.isEmpty()))))
        throw new java.lang.IllegalArgumentException("s must not be empty.");
    if ((o == null))
        throw new java.lang.NullPointerException("o");
    if (((o != null) && ("".equals(o.toString()) || (((java.lang.Object) o instanceof java.util.Collection) && (java.util.Collection) (java.lang.Object) o.isEmpty()))))
        throw new java.lang.IllegalArgumentException("o must not be empty.");
    if (((p != null) && ("".equals(p.toString()) || (((java.lang.Object) p instanceof java.util.Collection) && (java.util.Collection) (java.lang.Object) p.isEmpty()))))
        throw new java.lang.IllegalArgumentException("p must not be empty.");
    if (((a != null) && (a.length == 0)))
        throw new java.lang.IllegalArgumentException("a must not be empty.");
    this.i = i;
    this.s = s;
    this.o = o;
    this.p = p;
    this.a = a;
  }
  public @lombok.NonEmpty @java.lang.SuppressWarnings("all") int getI() {
    return this.i;
  }
  public @lombok.NonEmpty @java.lang.SuppressWarnings("all") String getS() {
    return this.s;
  }
  public @lombok.NonNull @lombok.NonEmpty @java.lang.SuppressWarnings("all") Object getO() {
    return this.o;
  }
  public @Nullable @lombok.NonEmpty @java.lang.SuppressWarnings("all") Object getP() {
    return this.p;
  }
  public @lombok.NonEmpty @java.lang.SuppressWarnings("all") int[] getA() {
    return this.a;
  }
  public @java.lang.SuppressWarnings("all") void setI(final @lombok.NonEmpty int i) {
    this.i = i;
  }
  public @java.lang.SuppressWarnings("all") void setS(final @lombok.NonEmpty String s) {
    if (((s != null) && ("".equals(s.toString()) || (((java.lang.Object) s instanceof java.util.Collection) && (java.util.Collection) (java.lang.Object) s.isEmpty()))))
        throw new java.lang.IllegalArgumentException("s must not be empty.");
    this.s = s;
  }
  public @java.lang.SuppressWarnings("all") void setO(final @lombok.NonNull @lombok.NonEmpty Object o) {
    if ((o == null))
        throw new java.lang.NullPointerException("o");
    if (((o != null) && ("".equals(o.toString()) || (((java.lang.Object) o instanceof java.util.Collection) && (java.util.Collection) (java.lang.Object) o.isEmpty()))))
        throw new java.lang.IllegalArgumentException("o must not be empty.");
    this.o = o;
  }
  public @java.lang.SuppressWarnings("all") void setP(final @Nullable @lombok.NonEmpty Object p) {
    if (((p != null) && ("".equals(p.toString()) || (((java.lang.Object) p instanceof java.util.Collection) && (java.util.Collection) (java.lang.Object) p.isEmpty()))))
        throw new java.lang.IllegalArgumentException("p must not be empty.");
    this.p = p;
  }
  public @java.lang.SuppressWarnings("all") void setA(final @lombok.NonEmpty int[] a) {
    if (((a != null) && (a.length == 0)))
        throw new java.lang.IllegalArgumentException("a must not be empty.");
    this.a = a;
  }
}