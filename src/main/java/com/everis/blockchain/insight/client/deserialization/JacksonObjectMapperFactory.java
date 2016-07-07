/*
 * The MIT License
 *
 * Copyright 2016 mrmx.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.everis.blockchain.insight.client.deserialization;

import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.lang.annotation.Annotation;
import si.mazi.rescu.serialization.jackson.DefaultJacksonObjectMapperFactory;

/**
 *
 * @author mrmx
 */
public class JacksonObjectMapperFactory extends DefaultJacksonObjectMapperFactory {

    @Override
    public ObjectMapper createObjectMapper() {
        ObjectMapper objectMapper = super.createObjectMapper(); 
        objectMapper.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, true);
        return objectMapper;
    }
    
    @Override
    protected ObjectMapper createInstance() {
        return new ObjectMapper() {
            @Override
            protected Object _unwrapAndDeserialize(JsonParser jp, DeserializationContext ctxt, DeserializationConfig config, JavaType rootType, JsonDeserializer<Object> deser) throws IOException {
                Annotation rootAnnotation = rootType.getRawClass().getAnnotation(JsonRootName.class);
                if(rootAnnotation == null) {                    
                    return deser.deserialize(jp, ctxt);
                }               
                return super._unwrapAndDeserialize(jp, ctxt, config, rootType, deser);
            }
            
        };
    }
}
