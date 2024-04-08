package com.doyospy.core.helper;

import com.doyospy.core.util.IdUtil;
import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.IOException;
import java.util.Objects;

/**
 * ID反序列化
 * @author  Robin
 */
public class IdDeserializer extends JsonDeserializer<Object> {
    @Override
    public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JacksonException {
        if (Objects.isNull(p)) {
            return null;
        }
        return IdUtil.decode(p.getText());
    }
}
