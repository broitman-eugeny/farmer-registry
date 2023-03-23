package com.isands.farmer.registry.service.persistence;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class RefPK implements Comparable<RefPK>, Serializable {
    public long farmerId;
    public long regionId;

    public RefPK() {
    }

    public RefPK(long farmerId, long regionId) {
        this.farmerId = farmerId;
        this.regionId = regionId;
    }

    public long getFarmerId() {
        return farmerId;
    }

    public void setFarmerId(long farmerId) {
        this.farmerId = farmerId;
    }

    public long getRegionId() {
        return regionId;
    }

    public void setRegionId(long regionId) {
        this.regionId = regionId;
    }

    @Override
    public int compareTo(RefPK pk) {
        if (pk == null) {
            return -1;
        }

        int value = 0;

        if (farmerId < pk.farmerId) {
            value = -1;
        } else if (farmerId > pk.farmerId) {
            value = 1;
        } else {
            value = 0;
        }

        if (value != 0) {
            return value;
        }

        if (regionId < pk.regionId) {
            value = -1;
        } else if (regionId > pk.regionId) {
            value = 1;
        } else {
            value = 0;
        }

        if (value != 0) {
            return value;
        }

        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof RefPK)) {
            return false;
        }

        RefPK pk = (RefPK) obj;

        if ((farmerId == pk.farmerId) && (regionId == pk.regionId)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (String.valueOf(farmerId) + String.valueOf(regionId)).hashCode();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(10);

        sb.append(StringPool.OPEN_CURLY_BRACE);

        sb.append("farmerId");
        sb.append(StringPool.EQUAL);
        sb.append(farmerId);

        sb.append(StringPool.COMMA);
        sb.append(StringPool.SPACE);
        sb.append("regionId");
        sb.append(StringPool.EQUAL);
        sb.append(regionId);

        sb.append(StringPool.CLOSE_CURLY_BRACE);

        return sb.toString();
    }
}
