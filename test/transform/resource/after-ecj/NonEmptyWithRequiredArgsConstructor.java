import java.lang.annotation.*;
@lombok.RequiredArgsConstructor @lombok.Getter @lombok.Setter class NonEmptyWithRequiredArgsConstructor {
  final String s;
  @lombok.NonEmpty int[] a;
  public @java.beans.ConstructorProperties({"s"}) @java.lang.SuppressWarnings("all") NonEmptyWithRequiredArgsConstructor(final String s) {
    super();
    this.s = s;
  }
  public @java.lang.SuppressWarnings("all") String getS() {
    return this.s;
  }
  public @lombok.NonEmpty @java.lang.SuppressWarnings("all") int[] getA() {
    return this.a;
  }
  public @java.lang.SuppressWarnings("all") void setA(final @lombok.NonEmpty int[] a) {
    if (((a != null) && (a.length == 0)))
        throw new java.lang.IllegalArgumentException("a must not be empty.");
    this.a = a;
  }
}