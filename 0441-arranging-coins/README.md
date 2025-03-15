<h2><a href="https://leetcode.com/problems/arranging-coins/">441. Arranging Coins</a></h2><h3>Easy</h3><hr><p>You have <code>n</code> coins and you want to build a staircase with these coins. The staircase consists of <code>k</code> rows where the <code>i<sup>th</sup></code> row has exactly <code>i</code> coins. The last row of the staircase <strong>may be</strong> incomplete.</p>

<p>Given the integer <code>n</code>, return <em>the number of <strong>complete rows</strong> of the staircase you will build</em>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/04/09/arrangecoins1-grid.jpg" style="width: 253px; height: 253px;" />
<pre>
<strong>Input:</strong> n = 5
<strong>Output:</strong> 2
<strong>Explanation:</strong> Because the 3<sup>rd</sup> row is incomplete, we return 2.
</pre>

<p><strong class="example">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/04/09/arrangecoins2-grid.jpg" style="width: 333px; height: 333px;" />
<pre>
<strong>Input:</strong> n = 8
<strong>Output:</strong> 3
<strong>Explanation:</strong> Because the 4<sup>th</sup> row is incomplete, we return 3.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= n &lt;= 2<sup>31</sup> - 1</code></li>
</ul>

<h3> Logic behind the solution - </h3>
<p>
	Step 1: Start with the original inequality:
(K * (K + 1)) / 2 <= N

Step 2: Multiply both sides by 2 to eliminate the fraction:
K * (K + 1) <= 2 * N

Step 3: Expand the left-hand side:
K^2 + K <= 2 * N

Step 4: Add 1/4 to both sides to complete the square:
K^2 + K + 1/4 <= 2 * N + 1/4

Step 5: Rewrite the left-hand side as a perfect square:
(K + 1/2)^2 <= 2 * N + 1/4

Step 6: Take the square root of both sides:
K + 1/2 <= sqrt(2 * N + 1/4)

Step 7: Subtract 1/2 from both sides to solve for K:
K <= sqrt(2 * N + 1/4) - 1/2

</p>
