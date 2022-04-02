# 分库分表

# 使用到的sql

```sql
CREATE TABLE `course_1` (
  `cid` bigint NOT NULL,
  `cname` varchar(20) COLLATE utf8mb4_bin DEFAULT NULL,
  `cstatus` varchar(2) COLLATE utf8mb4_bin DEFAULT NULL,
  `user_id` bigint DEFAULT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;
CREATE TABLE `course_2` (
  `cid` bigint NOT NULL,
  `cname` varchar(20) COLLATE utf8mb4_bin DEFAULT NULL,
  `cstatus` varchar(2) COLLATE utf8mb4_bin DEFAULT NULL,
  `user_id` bigint DEFAULT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

```

