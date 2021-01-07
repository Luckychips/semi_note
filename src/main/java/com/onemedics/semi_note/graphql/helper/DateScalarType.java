package com.onemedics.semi_note.graphql.helper;

import java.util.*;
import java.text.SimpleDateFormat;
import graphql.schema.*;
import org.springframework.stereotype.Component;

@Component
public class DateScalarType extends GraphQLScalarType {
    public DateScalarType() {
        super("Date", "Date TIME", new Coercing() {
            @Override
            public Object serialize(Object o) throws CoercingSerializeException {
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                return formatter.format((Date) o);
            }

            @Override
            public Object parseValue(Object o) throws CoercingParseValueException {
                return o;
            }

            @Override
            public Object parseLiteral(Object o) throws CoercingParseLiteralException {
                if (o==null){
                    return null;
                }

                return o.toString();
            }
        });
    }
}
