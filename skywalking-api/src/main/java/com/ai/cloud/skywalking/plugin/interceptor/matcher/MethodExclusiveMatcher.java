package com.ai.cloud.skywalking.plugin.interceptor.matcher;

import com.ai.cloud.skywalking.plugin.interceptor.MethodMatcher;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.matcher.ElementMatcher;

import static net.bytebuddy.matcher.ElementMatchers.named;
import static net.bytebuddy.matcher.ElementMatchers.not;

public class MethodExclusiveMatcher extends MethodMatcher {

    public MethodExclusiveMatcher(String methodMatchDescribe) {
        super(methodMatchDescribe);
    }

    public MethodExclusiveMatcher(String methodMatchDescribe, int argNum) {
        super(methodMatchDescribe, argNum);
    }

    public MethodExclusiveMatcher(String methodMatchDescribe, Class<?>[] argTypeArray) {
        super(methodMatchDescribe, argTypeArray);
    }

    public MethodExclusiveMatcher(Modifier modifier, String methodMatchDescribe) {
        super(modifier, methodMatchDescribe);
    }

    public MethodExclusiveMatcher(Modifier modifier, String methodMatchDescribe, int argNum) {
        super(modifier, methodMatchDescribe, argNum);
    }

    public MethodExclusiveMatcher(Modifier modifier, String methodMatchDescribe, Class<?>[] argTypeArray) {
        super(modifier, methodMatchDescribe, argTypeArray);
    }

    @Override
    public ElementMatcher.Junction<MethodDescription> builderMatcher() {
        ElementMatcher.Junction<MethodDescription> matcher = named(getMethodMatchDescribe());
        return not(mergeArgumentsIfNecessary(matcher));
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("any method exclude ");

        stringBuilder.append(" method named " + getMethodMatchDescribe());

        if (getModifier() != null) {
            stringBuilder.append(getModifier());
        }

        if (getArgNum() > -1) {
            stringBuilder.append(" with " + getArgNum() + " arguments");
        }

        if (getArgTypeArray() != null) {
            stringBuilder.append(" with ");
            for (Class argType : getArgTypeArray()) {
                stringBuilder.append(argType.getName());
            }
        }

        return stringBuilder.toString();
    }
}
