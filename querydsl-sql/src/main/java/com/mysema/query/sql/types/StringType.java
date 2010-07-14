/*
 * Copyright (c) 2010 Mysema Ltd.
 * All rights reserved.
 *
 */
package com.mysema.query.sql.types;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

/**
 * @author tiwe
 *
 */
public class StringType implements Type<String>{

    @Override
    public String getValue(ResultSet rs, int startIndex) throws SQLException {
        return rs.getString(startIndex);
    }

    @Override
    public Class<String> getReturnedClass() {
        return String.class;
    }

    @Override
    public void setValue(PreparedStatement st, int startIndex, String value)
            throws SQLException {
        st.setString(startIndex, value);
        
    }

    @Override
    public int[] getSQLTypes() {
        return new int[]{Types.VARCHAR};
    }

}
