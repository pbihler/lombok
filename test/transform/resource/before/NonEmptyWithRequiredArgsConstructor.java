import java.lang.annotation.*;

@lombok.RequiredArgsConstructor
@lombok.Getter
@lombok.Setter
class NonEmptyWithRequiredArgsConstructor {
	final String s;
	@lombok.NonEmpty
	int[] a;
}