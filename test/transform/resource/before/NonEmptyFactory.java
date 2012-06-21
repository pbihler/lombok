import java.lang.annotation.*;

@lombok.AllArgsConstructor(staticName="of")
class NonEmptyFactory {
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
	
	@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE})
	@Retention(RetentionPolicy.CLASS)
	public @interface Nullable {}
}